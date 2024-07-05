<script setup>
defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>

<script>
export default {
  created: function () {
    document.body.style.backgroundColor = '#637074'
  }
}
</script>

<template>
  <div class="greetings">
  </div>
</template>

<style scoped>

h4 {
  font-family: 'Moirai One';
  /* font-family: 'Jura'; */
  font-size: 1.4rem;
  /* font-weight: 600; */
  margin-top: 10px;
  color: rgba(0, 0, 0, 0.795);
  /* padding-top: 5px; */
  /* background-color: rgba(255, 255, 255, 0.219); */
  padding: 6px;
  border-radius: 10px;
  width: 96%;
  text-align: center;
}
img {
  padding-top: 10px;
}

@media (min-width: 768) {
  .greetings h1,
  .greetings h3 {

    text-align: center;
  }
}
</style>