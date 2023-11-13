document.addEventListener("DOMContentLoaded", function(event) {

    getFields();
     
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

const getFields = () => {
    fetch("http://localhost:9000/fieldsJson")
    .then(response => response.json())
    .then(data => {
        console.log(data)
    })
}

const changeGifValue = (url,value) => {
    const parts = url.split("/");
    parts[parts.length-1] = value;
    const newUrl = parts.join("/");

    return newUrl;
}