<script>
import {RouterLink} from 'vue-router'
import DiceFail from '../components/DiceFail.vue'
import FigureSelect from '../components/FigureSelect.vue'
import PlayerSelect from '../components/PlayerSelect.vue'
import GameBoard from "../components/GameBoard.vue"
import axios from "axios"
export default {
    name: 'BoardView',
    components: {
        RouterLink,
        GameBoard,
        DiceFail,
        FigureSelect,
        PlayerSelect
    },
    data(){
        return {
            diceFailForm: false,
            diceValue: 6,
            playerForm: true,
            playerValue: null,
            figureForm: false,
            figureValue : null,
            fieldData : null
        }
    },
    methods: {
        retry() {
            // TODO
            console.log("retry")
        },
        assignPlayer(player) {
            console.log(player)
            this.playerValue= player
            this.playerForm  = false
            this.figureForm = true
        },
        assignFigure(figure) {
            // TODO
            console.log(figure)
            this.figureValue = figure
            this.figureForm = false
            this.sendMove()
        },
        sendMove() {
            // TODO
            console.log("sendMove")

            this.playerForm = true
        }

    }
}
</script>


<template>
<div>
     <h1>Mensch Ärgere dich nicht</h1>
    <div class="container">
        <GameBoard :fieldData="fieldData" /> 
        <DiceFail v-if="diceFailForm" :diceValue="diceValue" @confirm="retry" />
        <PlayerSelect v-if="playerForm" @assignPlayer="assignPlayer" />
        <FigureSelect v-if="figureForm" @assignFigure="assignFigure" />
    </div>
</div>
</template>

<style scoped>
h1 {
    font-size: 3em;
    text-align: center;
    margin : auto auto;
    margin-top: 10%;
    margin-bottom: 10%;
}
.container {
    display: flex;
    align-items: center;
    justify-content: center;
}
.container > * {
    margin-left: 5%;
    margin-right: 5%;
}



</style>