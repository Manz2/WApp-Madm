<script setup>
import { RouterView } from 'vue-router'
import Navbar from './components/AppNavbar.vue'
</script>

<template>
  <header>
    <Navbar/>
    <router-view></router-view>
  </header>

</template>

<style scoped>
</style>
