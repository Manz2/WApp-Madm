
const API_BASE_URL = "http://localhost:9000";

document.addEventListener("DOMContentLoaded", function(event) {

    const fields = loadFields()
     
    const form = document.querySelector("#form-1");

    form.addEventListener("submit", function(event) {
        const shakeBtn = document.querySelector(".shake-btn"); // Referenz auf den Button mit der Klasse ".shake-btn"
        
        event.preventDefault(); // Verhindert das Absenden des Formulars

        const diceResult = rollDice();

        const imgElement = document.querySelector("#gif-1");

        console.log(diceResult)

        const oldVal = imgElement.src;

        imgElement.src = changeGifValue(imgElement.src, diceResult + ".svg");
        setTimeout(() => imgElement.src = oldVal, 800)

        const ipt1 = document.createElement('input')
        const ipt2 = document.createElement('input')

        ipt1.type = "hidden"
        ipt1.name = "diceResult"
        ipt1.value = diceResult

        ipt2.type = "hidden"
        ipt2.name = "figur"
        ipt2.value = "1"

        form.append(ipt1)
        form.append(ipt2)


        if (diceResult === 6) {
            shakeBtn.style.backgroundColor = "green"; // Button grün machen


            setTimeout(() => {
                form.submit(); // Das Formular wird nach 1 Sekunde abgesendet
            }, 1000);
        }
        else {
            shakeBtn.classList.remove("short-shake");
            void shakeBtn.offsetWidth;
            shakeBtn.classList.add("short-shake");
            setTimeout(() => {
                form.submit(); // Das Formular wird nach 1 Sekunde abgesendet
            }, 1000);
        }
    });
});

const rollDice = () => {
    return Math.floor(Math.random() * 6) + 1;
}


const loadFields = async () => {
    const req = await fetch(API_BASE_URL + "/fieldsJson")
    const response = await req.json()
    const homefield = response.homeField
    const playerField = response.playerField
    const mainField = response.fieldField
    console.log({homefield,playerField,mainField})
    for(let i = 1; i <= 40; i++){
        const id = "#field-" + i
        const value = mainField[i-1]
        //document.querySelector(id).innerHTML = i-1 ENUMERATION
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

const changeGifValue = (url,value) => {
    const parts = url.split("/");
    parts[parts.length-1] = value;
    const newUrl = parts.join("/");

    return newUrl;
}