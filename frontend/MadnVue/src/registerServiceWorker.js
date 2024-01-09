/* eslint-disable no-console */

import { register } from 'register-service-worker'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// if (process.env.NODE_ENV === 'production') {
register(`${process.env.BASE_URL}service-worker.js`, {
  ready () {
    console.log(
      'App is being served from cache by a service worker.\n' +
        'For more details, visit https://goo.gl/AFskqB'
    )
  },
  registered () {
    console.log('Service worker has been registered.')
  },
  cached () {
    console.log('Content has been cached for offline use.')
  },
  updatefound () {
    console.log('New content is downloading.')
  },
  updated () {
    console.log('New content is available; please refresh.')
  },
  offline () {
    print('offline')
    const app = createApp(App)
    app.use(router)
    // Make BootstrapVue available throughout your project
    app.mount('#app')
    console.log('No internet connection found. App is running in offline mode.')
    app.prototype.$toast.error('No internet connection found. App is running in offline mode.')
    router.push({ name: 'OfflinePage' }) // Stelle sicher, dass der Name der Route korrekt ist
  },
  error (error) {
    print('offline')
    const app = createApp(App)
    app.use(router)
    // Make BootstrapVue available throughout your project
    app.mount('#app')
    console.log('No internet connection found. App is running in offline mode.')
    router.push({ name: 'OfflinePage' })
    console.error('Error during service worker registration:', error)
  }
})

// }
