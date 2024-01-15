<script>
import {RouterLink} from 'vue-router'
import { getCurrentUser } from 'aws-amplify/auth'
import { ref } from 'vue'

export default {
    name: "Home",
    components: {
        RouterLink
    },
    setup() {
        const loggedIn = ref(false)
        const isLoggedIn = async () => {
            try{
                const user = await getCurrentUser()
                loggedIn.value = true   
            }
            catch(err){
                loggedIn.value = false
            }
        }
        isLoggedIn()
    }
};

</script>



<template>
<div>
    <h1>Welcome to Mensch Ärgere dich nicht</h1>
    <router-link v-if="loggedIn" to="/playerSelect" class="btn btn-primary">Klicke hier um zu starten</router-link>
    <router-link v-else to="/auth" class="btn btn-primary">Klicke hier um dich anzumelden</router-link>
</div>
</template>

<style scoped>
h1 {
    font-size: 3em;
    text-align: center;
    margin : auto auto;
    margin-top: 10%;
}

.btn {
    font-size: 1.4em;
    display: block;
    width: 300px;
    text-align: center;
    margin:  auto auto;
    margin-top: 10%;
}

</style>