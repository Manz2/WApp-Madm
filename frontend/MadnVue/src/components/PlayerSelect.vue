<script >
import DiceGif from "../assets/wuerfel/DiceGif.gif"
export default {
    name: 'PlayerSelect',
    components: {
    },
    data(){
        return {
            gifSrc : DiceGif,
            playerSelected : null,
        }
    },
    methods: {
        confirm() {
            if(this.playerSelected == null){
                alert("Bitte wähle einen Spieler aus!")
                return 
            }
            this.$emit('assignPlayer', this.playerSelected)
        }
    }
}
</script>


<template>
<div class="card">
        <div class="form-group card-body">
          <label for="spieler">Welcher Spieler ist dran?</label>
          <select name="spieler" class="form-control" id="player-select" v-model="playerSelected">
            <option>A</option>
            <option>B</option>
            <option>C</option>
            <option>D</option>
          </select>
          <button id="wurf-button" class="btn btn-primary shake-btn" @click="confirm">Würfeln</button>
        </div> 
      <img id="gif-1" class="dice-gif" :src="gifSrc" alt="dice" />
</div>
</template>


<style scoped>
.card {
    width: 200px;
    height: 300px;

}
.card-body > * {
    margin-top: 10%;
}
#gif-1 {
  width: 80px;
  height: 80px;
  margin: 0 auto;
}
</style>