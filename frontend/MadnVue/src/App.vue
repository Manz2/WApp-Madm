<script setup>
import { Amplify } from "aws-amplify"
import Navbar from "./components/Navbar.vue"
import { getCurrentUser } from 'aws-amplify/auth'

const isLoggedIn = async () => {
  try{
    const user = await getCurrentUser()
  }
  catch(err){
  }
}
isLoggedIn()
</script>

<template>
  <header>
    <Navbar/>
      <Auth/>
    <router-view></router-view>
  </header>

</template>

<style scoped>
</style>
