<script setup>
import HelloWorld from '../components/HelloWorld.vue'
import SearchBox from '../components/SearchBox.vue'
import NavItems from '../components/NavItems.vue'
</script>

<template>
      <div class="greetings">
    <div class="titleimage">
      <img src="/src/assets/piano-svgrepo-com.svg" width="80" />
      <h1 class="green">{{ msg }}</h1>
      <img src="/src/assets/piano-svgrepo-com.svg" width="80" />
    </div>
    <h4>PERSONAL MUSIC GEAR INFORMATION CENTER</h4>
  </div>
  
      <div class="wrapper">
        <HelloWorld msg="music gear" />
        <div class="search">
          <NavItems />
          <SearchBox @search="filterGearItems" />
        </div>
      </div>
</template>
<script>
export default {}
</script>
<style scoped></style>
