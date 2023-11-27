
<script>
export default {
    name: 'GameBoard',
    components: {
    },
    data(){
        return {
            fieldData : null
        }
    },
    methods: {
        assignFromValues(fullBoardValues){
            console.log("assignFromValues")
            /* TODO
            const homefield = fullBoardValues.homeField
            const playerField = fullBoardValues.playerField
            const mainField = fullBoardValues.fieldField
            for (let i = 1; i <= 40; i++) {
                const id = "#field-" + i
                const value = mainField[i - 1]
                const ref = document.querySelector(id)
                ref.innerHTML = value
            }

            for (let i = 1; i < 5; i++) {
                for (let j = 1; j < 5; j++) {
                    const id = `#p${j}-home-${i}`
                    const index = (i + (j - 1) * 4) - 1
                    const value = playerField[index]
                    const ref = document.querySelector(id)
                    ref.innerHTML = value
                }
            }

            for (let i = 1; i < 5; i++) {
                for (let j = 1; j < 5; j++) {
                    const id = `#p${j}-final-${i}`
                    const index = (i + (j - 1) * 4) - 1
                    const value = homefield[index]
                    const ref = document.querySelector(id)
                    ref.innerHTML = value
                }
            }
        */
        },
    },
    created(){
        this.assignFromValues()
    }
}
</script>

<template>
    <div class="grid-container">
            <div class="grid-item p1" id="p1-home-1"></div>
            <div class="grid-item p1" id="p1-home-2"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-9"></div>
            <div class="grid-item" id="field-10" ></div>
            <div class="grid-item p2" id="field-11"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-1"></div>
            <div class="grid-item p2" id="p2-home-2"></div>

            <div class="grid-item p1" id="p1-home-3"></div>
            <div class="grid-item p1" id="p1-home-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-8"></div>
            <div class="grid-item p2" id="p2-final-1"></div>
            <div class="grid-item" id="field-12"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-3"></div>
            <div class="grid-item p2" id="p2-home-4"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">A</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-7"></div>
            <div class="grid-item p2" id="p2-final-2"></div>
            <div class="grid-item" id="field-13"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">B</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-6"></div>
            <div class="grid-item p2" id="p2-final-3"></div>
            <div class="grid-item" id="field-14"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item p1" id="field-1"></div>
            <div class="grid-item" id="field-2"></div>
            <div class="grid-item" id="field-3"></div>
            <div class="grid-item" id="field-4"></div>
            <div class="grid-item" id="field-5"></div>
            <div class="grid-item p2" id="p2-final-4"></div>
            <div class="grid-item" id="field-15"></div>
            <div class="grid-item" id="field-16"></div>
            <div class="grid-item" id="field-17"></div>
            <div class="grid-item" id="field-18"></div>
            <div class="grid-item" id="field-19"></div>

            <div class="grid-item" id="field-40"></div>
            <div class="grid-item p1" id="p1-final-1"></div>
            <div class="grid-item p1" id="p1-final-2"></div>
            <div class="grid-item p1" id="p1-final-3"></div>
            <div class="grid-item p1" id="p1-final-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-final-4"></div>
            <div class="grid-item p4" id="p4-final-3"></div>
            <div class="grid-item p4" id="p4-final-2"></div>
            <div class="grid-item p4" id="p4-final-1"></div>
            <div class="grid-item" id="field-20"></div>




            <div class="grid-item" id="field-39"></div>
            <div class="grid-item" id="field-38"></div>
            <div class="grid-item" id="field-37"></div>
            <div class="grid-item" id="field-36"></div>
            <div class="grid-item" id="field-35"></div>
            <div class="grid-item p3" id="p3-final-4"></div>
            <div class="grid-item" id="field-25"></div>
            <div class="grid-item" id="field-24"></div>
            <div class="grid-item" id="field-23"></div>
            <div class="grid-item" id="field-22"></div>
            <div class="grid-item p4" id="field-21"></div>




            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-34"></div>
            <div class="grid-item p3" id="p3-final-3"></div>
            <div class="grid-item" id="field-26"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">D</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-33"></div>
            <div class="grid-item p3" id="p3-final-2"></div>
            <div class="grid-item" id="field-27"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">C</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>


            <div class="grid-item p3" id="p3-home-1"></div>
            <div class="grid-item p3" id="p3-home-2"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-32"></div>
            <div class="grid-item p3" id="p3-final-1"></div>
            <div class="grid-item" id="field-28"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-1"></div>
            <div class="grid-item p4" id="p4-home-2"></div>

            <div class="grid-item p3" id="p3-home-3"></div>
            <div class="grid-item p3" id="p3-home-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p3" id="field-31" ></div>
            <div class="grid-item" id="field-30"></div>
            <div class="grid-item" id="field-29"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-3"></div>
            <div class="grid-item p4" id="p4-home-4"></div>

        </div>
</template>

<style scoped>
.container{
    text-align: center;
    margin: 0 auto;
    display: flex;
    flex-direction: row;
    justify-content: center;
}
.grid-container {
    display: grid;
    grid-template-columns: repeat(11, 30px); 
    grid-gap: 10px; 
    padding: 20px; 
    background: #FFFEBA;
    border: solid red 1px;
    border-radius: 5%;
    box-shadow: red 0px 0px 4px;
}

/* CSS für die Zellen */
.grid-item {
    width: 30px;
    height: 30px;
    border: 1px solid #000; /* Rand um jede Zelle */
    text-align: center;
    line-height: 30px;
    font-size: 14px;
    border-radius: 99%;
    background: #FFFFFF;
}

.grid-item:hover {
    background: #40488F;
    cursor: pointer;
    border: solid white 1px;
}

.hidden {
    border: none;
    background: #FFFEBA;;
}
.hidden:hover {
    border: none;
    cursor: default;
    background: #FFFEBA;;
}

.p1{ /* Spieler A */
    background-color: #009DFF;
}

.p2{ /* Spieler B */
    background-color: #FF0000;
}

.p3{ /* Spieler C */
    background-color: #FFFC00;
}
.p4{ /* Spieler D */
    background-color: #00BF02;
}
</style>