<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Navbar from "./components/Navbar.vue"
</script>

<template>
  <header>
    <Navbar/>
    <router-view></router-view>
  </header>

</template>

<style scoped>
</style>
