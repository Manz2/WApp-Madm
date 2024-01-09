<!-- OfflinePage.vue -->

<template>
  <div class="offline-page">
    <h1 class="title">Madn - Offline</h1>
    <p class="message">
      Oh nein! Keine Internetverbindung gefunden. Madn wird im Offline-Modus ausgeführt.
    </p>
    <router-link to="/" class="back-button">
      Zurück zur Startseite
    </router-link>
  </div>
</template>

<script>
export default {
  name: 'OfflinePage'
}
</script>

<style scoped>
/* Beispielhaftes Styling für die Offline-Seite */
.offline-page {
  text-align: center;
  padding: 20px;
}

.logo {
  max-width: 150px;
  margin-bottom: 20px;
}

.title {
  font-size: 24px;
  color: #333;
  margin-bottom: 10px;
}

.message {
  font-size: 16px;
  color: #666;
  margin-bottom: 20px;
}

.back-button {
  padding: 10px 20px;
  background-color: #3498db;
  color: #fff;
  text-decoration: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.back-button:hover {
  background-color: #2980b9;
}
</style>
