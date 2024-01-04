<script>
export default {
  name: 'DiceFail',
  components: {
  },
  data () {
    return {
    }
  },
  methods: {
    confirm () {
      this.$emit('confirm')
    }
  },
  props: {
    diceValue: Number
  }
}
</script>

<template>
<div class="card">
  <h5 class="card-header">Achtung!</h5>
  <div class="card-body">
    <h5 class="card-title">Du hast eine {{ diceValue }} gewürfelt</h5>
    <p class="card-text">Du musst eine 6 würfel da du keinen Spieler draußen hast</p>
    <button @click="confirm" class="btn btn-primary">Nochmal probieren</button>
  </div>
</div>
</template>

<style scoped>
.card-body {
    margin-top: 2%;
}
</style>
