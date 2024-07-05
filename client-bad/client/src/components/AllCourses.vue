<template>
  <article v-for="course in courses" v-bind:key="course.id" class="course">
    <div class="name">
      {{ course.name }}
    </div>
    <div class="description">${{ course.description }}</div>
    <div class="courseId">
      {{ course.courseId }}
    </div>
    <div class="completed">[ ] completed</div>
  </article>
</template>

<script>
export default {
  data() {
    return {}
  },
  props: {
    products: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>
.item {
  margin-top: 2rem;
  display: flex;
  position: relative;
}

.details {
  flex: 1;
  margin-left: 1rem;
}

hr {
  border: 0;
  height: 1px;
  background-image: linear-gradient(
    to right,
    rgba(0, 0, 0, 0),
    rgba(0, 0, 0, 0.1),
    rgba(0, 0, 0, 0)
  );
}

i {
  display: flex;
  place-items: center;
  place-content: center;
  width: 32px;
  height: 32px;
  color: black;
}

h3 {
  font-size: 1.2rem;
  font-weight: 300;
  margin-bottom: 0.4rem;
  color: #000000;
}

@media (min-width: 1024px) {
  .item {
    margin-top: 0;
    padding: 0.4rem 0 1rem calc(var(--section-gap) / 2);
  }

  i {
    top: calc(50% - 25px);
    left: -26px;
    position: absolute;
    border: 1px solid var(--color-border);
    background: var(--color-background);
    border-radius: 8px;
    width: 50px;
    height: 50px;
  }

  .item:before {
    content: ' ';
    border-left: 1px solid var(--color-border);
    position: absolute;
    left: 0;
    bottom: calc(50% + 25px);
    height: calc(50% - 25px);
  }

  .item:after {
    content: ' ';
    border-left: 1px solid var(--color-border);
    position: absolute;
    left: 0;
    top: calc(50% + 25px);
    height: calc(50% - 25px);
  }

  .item:first-of-type:before {
    display: none;
  }

  .item:last-of-type:after {
    display: none;
  }
}
</style>
