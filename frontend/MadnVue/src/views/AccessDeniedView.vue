

<script>
export default {
    name: "AccessDenied",
    };
</script>

<template>
  <div class="container" style="margin-top: 200px;">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="alert alert-danger" role="alert">
          Sie sind nicht berechtigt, bitte melden Sie sich zuerst an.
        </div>
        <button class="btn btn-danger" @click="this.$router.push('/auth')">Zurück zu Login</button>
      </div>
    </div>
  </div>
</template>
<style scoped>
</style>