<script>
import {RouterLink} from 'vue-router'


</script>



<template>
<div>
    <h1>Welcome to Mensch Ärgere dich nicht</h1>
    <router-link to="/playerSelect" class="btn btn-primary">Klicke hier um zu starten</router-link>
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