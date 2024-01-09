import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('../views/HomeView.vue')
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/board',
      name: 'board',
      component: () => import('../views/BoardView.vue')
    },
    {
      path: '/playerSelect',
      name: 'playerSelect',
      component: () => import('../views/PlayerSelectView.vue')
    },
    {
      path: '/offline',
      name: 'OfflinePage',
      component: () => import('../views/OfflinePage.vue')
    }
  ]
})

export default router
