const API_BASE_URL = "http://localhost:9000";

/* Globale Variablen */
let diceValue = 0;
let player = 0;
let figure = 0;

let fieldData = null

const player2num = {
    "A" : 0,
    "B" : 1,
    "C" : 2,
    "D" : 3
}



/* Helper Functions */
const loadFields = async () => {
    const req = await fetch(API_BASE_URL + "/fieldsJson")
    const response = await req.json()
    fieldData = response
    const homefield = response.homeField
    const playerField = response.playerField
    const mainField = response.fieldField
    //console.log({homefield,playerField,mainField})
    for(let i = 1; i <= 40; i++){
        const id = "#field-" + i
        const value = mainField[i-1]
        console.log({id,value})
        //document.querySelector(id).innerHTML = i-1 
        document.querySelector(id).innerHTML = value
    }

    for (let i=1; i < 5; i++){
        for (let j=1; j < 5; j++){
            const id = `#p${j}-home-${i}`
            const index = (i + (j-1) * 4) - 1
            const value = playerField[index]
            const ref = document.querySelector(id)
            ref.innerHTML = value
        }
    }

    for (let i=1; i < 5; i++){
        for (let j=1; j < 5; j++){
            const id = `#p${j}-final-${i}`
            const index = (i + (j-1) * 4) - 1
            const value = homefield[index]
            const ref = document.querySelector(id)
            ref.innerHTML = value
        }
    }

}

const isFirstMove = (player) => {
    const playerNum = player2num[player]
    if (fieldData === null) {return true}
    const playerField = fieldData.playerField
    const startIndex= playerNum * 4
    const endIndex = startIndex + 4
    //console.log({startIndex,endIndex,playerField,player})
    for(let i = startIndex; i < endIndex; i++){
        if (playerField[i] == "") {return false}
    }
    
    return true;
}

const rollDice = () => {
    const diceValue = Math.floor(Math.random() * 6) + 1;
    return diceValue;
}
const pushChange = (diceValue,player,figure) => {
    console.log({diceValue,player,figure})
    fetch(API_BASE_URL + "/fieldsJson",{
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            player : player,
            figure : figure,
            diceVal : diceValue.toString()
        })
    })
    .then(res => res.json().then(data => console.log(data)))
    .catch(err => console.log(err))
}









// Warte bis DOM geladen wurde
document.addEventListener("DOMContentLoaded", function(event) {


    /* Extract DOM Elements */
    const playerForm = document.querySelector("#player-select-form");
    const figureForm = document.querySelector("#figure-select-form");
    const diceFailForm = document.querySelector("#diceFail-form");
    const wurfButton = document.querySelector("#wurf-button");
    const figureButton = document.querySelector("#figure-button");
    const playerSelect = document.querySelector("#player-select");
    const figureSelect = document.querySelector("#figure-select");
    const diceFailButton = document.querySelector("#diceFail-button");
    const diceFailLabel = document.querySelector("#diceFail-label");
    const diceImage = document.querySelector("#dice-image");


    loadFields() // Initialisiere das Spielfeld


    figureForm.style.display = "none"; // Verstecke Figuren Auswahl
    diceFailForm.style.display = "none"; // Verstecke Würfel Fehler





    wurfButton.addEventListener("click", function(event) {
        diceValue = rollDice(); 
        player = playerSelect.value;
        //console.log("isFirstMove",isFirstMove(player))
        console.log("diceValue",diceValue)
        if (isFirstMove(player) && diceValue != 6) {
            diceFailForm.style.display = "block";
            playerForm.style.display = "none";
            diceFailLabel.innerHTML = `Du hast eine <strong>${diceValue}</strong> gewürfelt. Du musst eine 6 würfeln um eine Figur aus dem Haus zu bekommen.`
            return;
        }
        figureForm.style.display = "block";
        diceImage.src = assignDiceImage(diceValue)
        playerForm.style.display = "none";
    })

    figureButton.addEventListener("click", function(event) {
        figure = figureSelect.value;
        pushChange(diceValue,player,figure)

        loadFields()
        figureForm.style.display = "none";
        playerForm.style.display = "block";

    })

    diceFailButton.addEventListener("click", function(event) {
        playerForm.style.display = "block";
        diceFailForm.style.display = "none";
    })
     
});


const assignDiceImage = (diceValue) => {
    return `/assets/images/dice/${diceValue}.svg`
}








