<script >
export default {
    name: 'PlayerSelect',
    components: {
    },
    data(){
        return {
            playerSelected : null,
        }
    },
    methods: {
        confirm() {
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
          <div id="box"> 
            <img id="gif-1" class="dice-gif" src="" alt="dice" />
          </div>
        </div> 
</div>
</template>


<style scoped>
.card {
    width: 200px;
    height: 300px;

}
</style>