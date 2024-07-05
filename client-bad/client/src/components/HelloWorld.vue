<script setup>
defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>

<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>
    <h3>Bachelors of Science <br />Software Engineering at WGU</h3>
    
      <br />
      ❍ The data for each course is stored in a sql database accessed through a server written in
      Java<br />
      <br />
      ❍ The book icon will be clickable to represent if the course is completed or not, replaced by
      green checkmark<br />
      <br />
      ❍ Need to add description in database
      <br />
      like on TE project

  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
  color: black;
}

h4 {
  font-size: 0.76;
  text-decoration: underline;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

.notes {
  display: flex;
}


@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
