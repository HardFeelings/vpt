import { createApp } from 'vue'
import PrimeVue from 'primevue/config';
import './style.css'
import App from './App.vue'
import { createPinia } from 'pinia';
import 'primevue/resources/themes/bootstrap4-light-blue/theme.css'

const pinia = createPinia()
const app = createApp(App)
app.use(pinia)
app.use(PrimeVue)
app.mount('#app')

