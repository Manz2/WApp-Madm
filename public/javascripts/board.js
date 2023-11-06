document.addEventListener("DOMContentLoaded", function(event) {
     
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


        if (diceResult === 6) {
            shakeBtn.style.backgroundColor = "green"; // Button grün machen

            setTimeout(() => {
                this.submit(); // Das Formular wird nach 1 Sekunde abgesendet
            }, 1000);
        }
        else {
            shakeBtn.classList.remove("short-shake");
            void shakeBtn.offsetWidth;
            shakeBtn.classList.add("short-shake");
        }
    });
});

const rollDice = () => {
    return Math.floor(Math.random() * 6) + 1;
}

const changeGifValue = (url,value) => {
    const parts = url.split("/");
    parts[parts.length-1] = value;
    const newUrl = parts.join("/");

    return newUrl;
}