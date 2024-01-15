import { createRouter, createWebHistory } from 'vue-router'
import { getCurrentUser } from 'aws-amplify/auth'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path : '/auth',
      name: 'auth',
      component: () => import('../views/AuthView.vue'),
    },
    {
      path: '/',
      name: 'home',
      component: () => import('../views/HomeView.vue'),
      meta: { requiresAuth: false}
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue'),
    },
    {
      path: '/board',
      name: 'board',
      component: () => import('../views/BoardView.vue'),
      meta: { requiresAuth: true }
    },
    {
      path: '/playerSelect',
      name: 'playerSelect',
      component: () => import('../views/PlayerSelectView.vue'),
      meta: { requiresAuth: true }
    },
    {
      path: '/accessDenied',
      name: 'accessDenied',
      component: () => import('../views/AccessDeniedView.vue')
    }
  ]
})

router.beforeEach(async (to, from, next) => {
  if(to.name === 'auth' || to.name === 'accessDenied'){
    next()
  }
  if (to.meta.requiresAuth) {
    try{
      const user = await getCurrentUser()
      next()
    }
    catch(e){
      next("/accessDenied")
    }
  }
  else {
    next()
  }
})

export default router
