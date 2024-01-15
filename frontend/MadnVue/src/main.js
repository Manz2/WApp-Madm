import './assets/main.css'
import { Amplify } from 'aws-amplify'
import config from '@/amplifyconfiguration.json'
Amplify.configure(config)

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(router)

app.mount('#app')
