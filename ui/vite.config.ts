import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  server: {
    proxy: {
     '/api': 'http://localhost:8080/'
    }
  },
  plugins: [vue()],
})

