import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    redirect: { name: 'courses' }
  },
  {
    path: '/courses',
    name: 'courses',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutView
  }
]

// Create the router
const router = createRouter({
  history: createWebHistory(),
  routes: routes
})

export default router
