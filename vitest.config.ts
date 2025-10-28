import { defineConfig } from 'vitest/config'
import vue from '@vitejs/plugin-vue'

export default defineConfig({
  plugins: [vue()], // 👈 enable Vue support
  test: {
    globals: true,
    environment: 'jsdom', // important for Vue DOM tests
  },
})