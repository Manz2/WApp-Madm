
<script>
import Dice1 from "../assets/wuerfel/Dice1.svg"
import Dice2 from "../assets/wuerfel/Dice2.svg"
import Dice3 from "../assets/wuerfel/Dice3.svg"
import Dice4 from "../assets/wuerfel/Dice4.svg"
import Dice5 from "../assets/wuerfel/Dice5.svg"
import Dice6 from "../assets/wuerfel/Dice6.svg"
export default {
    name: 'FigureSelect',
    components: {
    },
    data(){
        return {
            figureSelected: 0,
            dice1Ref : Dice1,
            dice2Ref : Dice2,
            dice3Ref : Dice3,
            dice4Ref : Dice4,
            dice5Ref : Dice5,
            dice6Ref : Dice6,
        }
    },
    methods: {
        confirm() {
            if (this.figureSelected == 0 ) {
                alert("Bitte wähle eine Figur aus!")
                return
            }
            this.$emit('assignFigure', this.figureSelected)
        }
    },
    computed: {
        diceImage(){
            switch (this.figureSelected) {
                case 1:
                    return this.dice1Ref
                case 2:
                    return this.dice2Ref
                case 3:
                    return this.dice3Ref
                case 4:
                    return this.dice4Ref
                case 5:
                    return this.dice5Ref
                case 6:
                    return this.dice6Ref
                default:
                    return this.dice1Ref
            }
        }
    }
}
</script>


<template>
<div class="card">
    <div class="form-group card-body">
            <label for="figur">Mit welcher Figur willst du Fahren</label>
            <select name="figur" class="form-control" id="figure-select" v-model="figureSelected">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
            <button id="figure-button" class="btn btn-primary" @click="confirm">Fahren</button>
            <div id="box-dynamic">
             <img class="img-dynamic" id="dice-image" :src="diceImage" alt="one" />
            </div>
    </div>
</div>
</template>


<style scoped>
.card {
    width: 200px;;
    height: 300px;
}
#box-dynamic {
    width: 100px;
    height: 100px;
    margin: 0 auto;
}
.card-body > * {
    margin-top: 10%;
}
#dice-image {
    width: 100px;
    height: 100px;
    margin: 0 auto;
}
</style> 