const API_BASE_URL = "http://localhost:9000";

const SECOND = 1000

const LOGGING = true
var POLLING = true
var SOCKET = !POLLING
var POLLING_INVERVALL = 0.5 * SECOND
var SOCKET_INVERVALL = POLLING_INVERVALL 
let SOCKET_OPEN = false
var SOCKET_TIMER = null
var SOCKET_REF = null

/* Globale Variablen */
let diceValue = 0;
let player = 0;
let figure = 0;

let fieldData = null



const player2num = {
    "A": 0,
    "B": 1,
    "C": 2,
    "D": 3
}

const loadFields = async () => {
    LOGGING ? console.log("loadFields") : null
    console.log({POLLING,POLLING_INVERVALL})
    const healthStatus = $("#health");
    const healthStatusText = $("#health-text");
    let response = null
    try{
        const req = await fetch(API_BASE_URL + "/fieldsJson")
        response = await req.json()
        //healthStatus.style.backgroundColor = "green";
        healthStatus.css("background-color", "green")
        //healthStatusText.innerHTML = "Connected"
        healthStatusText.html("REST Connected")
    } catch (e) {
        LOGGING ? console.log(e) : null
        //healthStatus.style.backgroundColor = "red";
        healthStatus.css("background-color", "red")
        //healthStatusText.innerHTML = "Disconnected"
        healthStatusText.html("REST Disconnected")
        return null
    } finally{
        return JSON.stringify(response)
    }
}

const loadRest = async () => {
    const fields = await loadFields()
    await assignFields(fields)
}

/* Helper Functions */
const assignFields = async  (_fields) => {
    const fields = JSON.parse(_fields)
    LOGGING ? console.log("***fields",typeof(fields)) : null
    
    fieldData = fields
    const homefield = fields.homeField
    const playerField = fields.playerField
    const mainField = fields.fieldField
    for (let i = 1; i <= 40; i++) {
        const id = "#field-" + i
        const value = mainField[i - 1]
        const ref = $(id)
        ref.html(value)
    }

    for (let i = 1; i < 5; i++) {
        for (let j = 1; j < 5; j++) {
            const id = `#p${j}-home-${i}`
            const index = (i + (j - 1) * 4) - 1
            const value = playerField[index]
            const ref = $(id)
            ref.html(value)
        }
    }

    for (let i = 1; i < 5; i++) {
        for (let j = 1; j < 5; j++) {
            const id = `#p${j}-final-${i}`
            const index = (i + (j - 1) * 4) - 1
            const value = homefield[index]
            const ref = $(id)
            ref.html(value)
        }
    }
    LOGGING ? console.log("loadFields done") : null
}


const isFirstMove = (player) => {
    const playerNum = player2num[player]
    if (fieldData === null) { return true }
    const playerField = fieldData.playerField
    const startIndex = playerNum * 4
    const endIndex = startIndex + 4
    for (let i = startIndex; i < endIndex; i++) {
        if (playerField[i] == "") { return false }
    }

    return true;
}

const rollDice = () => {
    const diceValue = Math.floor(Math.random() * 6) + 1;
    return diceValue;
}
const pushChange = async (diceValue, player, figure) => {
    LOGGING ? console.log({ diceValue, player, figure }) : null
    const res = await fetch(API_BASE_URL + "/fieldsJson", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            player: player,
            figure: figure,
            diceVal: diceValue.toString()
        })
    })
    const data = await res.json()
    LOGGING ? console.log(data) : null
}



const connectWebsocket = () => {
    var socket = new WebSocket("ws://localhost:9000/websocket")
    SOCKET_REF = socket
    const healthStatus = $("#health");
    const healthStatusText = $("#health-text");
    socket.onopen = function (event) {
        console.log("***socket open", event)
        SOCKET_OPEN = true
        healthStatus.css("background-color", "green")
        healthStatusText.html("WS Connected")
    }

    socket.onmessage = function (message) {
        const payload = message.data
        assignFields(payload)
        healthStatus.css("background-color", "green")
        healthStatusText.html("WS Connected")
    }
    socket.onerror = function (error) {
        console.log("***error=",error)
    }
    socket.onclose = function () {
        console.log("***socket close")
        SOCKET_OPEN = false
        healthStatus.css("background-color", "red")
        healthStatusText.html("Disconnected")
    }
}

const checkAndReconnect = () => {
    if (!SOCKET_OPEN) {
        LOGGING ? console.log("Reconnecting websocket...") : null
        connectWebsocket()
    }
    SOCKET_TIMER = setTimeout(checkAndReconnect, SOCKET_INVERVALL)
}





// Warte bis DOM geladen wurde
$(document).ready(function () {
    /* Extract DOM Elements */
    const playerForm = $("#player-select-form");
    const figureForm = $("#figure-select-form");
    const diceFailForm = $("#diceFail-form");
    const wurfButton = $("#wurf-button");
    const figureButton = $("#figure-button");
    const playerSelect = $("#player-select");
    const figureSelect = $("#figure-select");
    const diceFailButton = $("#diceFail-button");
    const diceFailLabel = $("#diceFail-label");
    const diceImage = $("#dice-image");
    const newGameButton = $("#resetGame");
    const healthBox = $("#health-box")
    const healthModal = $("#health-modal")
    const connectionMode = $("#connection-mode")
    const connectionTimer = $("#connection-timer")
    const healthModalClose = $("#health-modal-close")
    const healtModalSave = $("#health-modal-save")
    const connectionTimerValue = $("#connection-timer-value")




    POLLING ? loadRest() : null // Initialisiere das Spielfeld
    var pollingTimer = POLLING ? setInterval(loadRest, POLLING_INVERVALL) : null // Konstantes Polling des Spielfelds
    SOCKET ? checkAndReconnect() : null// Socket handling


    figureForm.css("display", "none")
    diceFailForm.css("display", "none")


    newGameButton.click(async function (event) {
        await fetch(API_BASE_URL + "/resetGame")
        POLLING ? await loadRest() : null
    })



    wurfButton.click(function (event) {
        diceValue = rollDice();
        player = playerSelect.val();
        LOGGING ? console.log("diceValue", diceValue) : null
        if (isFirstMove(player) && diceValue != 6) {
            diceFailForm.css("display", "block")
            playerForm.css("display", "none");
            diceFailLabel.html(`Du hast eine <strong>${diceValue}</strong> gewürfelt. Du musst eine 6 würfeln um eine Figur aus dem Haus zu bekommen.`)
            return;
        }
        figureForm.css("display", "block");
        diceImage.attr("src", assignDiceImage(diceValue))
        playerForm.css("display", "none");
    })
    figureButton.click(async function(event){
        figure = figureSelect.val()
        await pushChange(diceValue, player, figure)

        POLLING ? await loadRest() : null
        figureForm.css("display", "none");
        playerForm.css("display", "block");

    })
    diceFailButton.click(function(event){
        playerForm.css("display", "block");
        diceFailForm.css("display", "none");
    })
    healthBox.click(function(event){
        healthModal.modal("show")
    })
    connectionTimer.val(POLLING_INVERVALL / SECOND)
    connectionTimerValue.html(POLLING_INVERVALL / SECOND)
    POLLING ? connectionMode.val("REST") : connectionMode.val("WS")
    healthModalClose.click(function(event){
        healthModal.modal("hide")
    })
    healtModalSave.click(function(event){
        const mode = connectionMode.select().val()
        const timer = connectionTimer.val()
        LOGGING ? console.log({mode, timer}) : null
        if (mode === "WS" ){
                POLLING = true
                console.log("-----")
                clearInterval(pollingTimer)
                checkAndReconnect()
                return 
        } else if (mode === "REST"){
            clearInterval(pollingTimer)
            POLLING_INVERVALL = timer * SECOND
            pollingTimer = setInterval(loadRest, POLLING_INVERVALL)
            POLLING = false
        } else {
            alert("Mode not supported")
        }
        POLLING_INVERVALL = timer * SECOND
        healthModal.modal("hide")
        console.log(POLLING_INVERVALL)
        console.log(POLLING)
    })

    connectionTimer.on("input", function(event){
        var timerValue = connectionTimer.val()
        connectionTimerValue.html(timerValue)
    })

   
});


const assignDiceImage = (diceValue) => {
    return `/assets/images/dice/${diceValue}.svg`
}