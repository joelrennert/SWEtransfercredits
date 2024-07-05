<script setup>
import { RouterLink } from 'vue-router'
</script>
<template>
  <nav>
    <RouterLink to="/">Home</RouterLink>
    <RouterLink to="/about">About</RouterLink>
  </nav>
</template>
<script>
export default {}
</script>

<style scoped>
nav {
  display: flex;
  width: 34%;
  font-family: 'Jura';
  font-size: 1rem;
  text-align: center;
  align-items: center;
}

nav a.router-link-exact-active {
  color: rgb(255, 255, 255);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
}

nav a:first-of-type {
  border: 0;
}
</style>
