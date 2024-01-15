<script>
import { Authenticator } from "@aws-amplify/ui-vue"
import "@aws-amplify/ui-vue/styles.css";
export default {
    name: 'Auth',
    components: {
        Authenticator
    }
}
</script>


<template>
<div class="alert alert-primary">
    <authenticator >
        <template v-slot="{ user, signOut }">
          <h1 class="">Hello {{ user.username }}!</h1>
          <div class="alert alert-dark" style="display: flex; flex-direction: row; justify-content: space-evenly; margin-top: 10px;">
          <button class="btn btn-secondary" @click="this.$router.push('/playerSelect')">Weiter</button>
          <button class="btn btn-secondary" @click="signOut">Sign Out</button>
          </div>
        </template>
      </authenticator>
</div>
</template>

<style scoped>
h1 {
    font-size: 3em;
    text-align: center;
    margin : auto auto;
    margin-top: 10%;
}
</style>
