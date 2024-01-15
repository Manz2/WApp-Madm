<script>
import {RouterLink} from 'vue-router'
import axios from 'axios'
const API_BASE_URL = "https://madn-backend-aa5ba5459298.herokuapp.com"
export default {
    name: 'HomeView',
    components: {
        RouterLink
    },
    data(){
        return {
            playerValue: 0
        }
    },
    methods: {
        startGame() {
            // TODO: 
            axios.get(`${API_BASE_URL}/resetGame`)
                .then(res => console.log(res))
                .catch(err => console.log(err))
            this.$router.push('/board')

        }
    }
}

</script>



<template>
<div>
    <h1>Welcome to Mensch Ärgere dich nicht</h1>
    <div class="input-group">
        <span class="input-group-text">Anzahl Spieler</span>
        <input type="number" v-model="playerValue" min="0" max="4" step="1" aria-label="Anzahl Spieler" class="form-control">
    </div> 
        <button class="btn btn-primary" @click="startGame" >Starte das Spiel</button>
</div>
</template>

<style scoped>
h1 {
    font-size: 3em;
    text-align: center;
    margin : auto auto;
    margin-top: 10%;
}

.input-group {
    font-size: 1.4em;
    width: 300px;
    text-align: center;
    margin:  auto auto;
    margin-top: 10%;
}

.btn {
    display: block;
    width: 300px;
    margin: auto auto;
    margin-top: 10%;
}

</style>