<template>
  <form @submit.prevent="onSubmit" class="searchcontainer">
    <input
      type="search"
      class="searchbox"
      v-model="query"
      placeholder="Type to search..."
      @input="onInput"
    />
    <button type="submit" class="searchbutton">Search</button>
  </form>
</template>

<script>
export default {
  data() {
    return {
      query: ''
    }
  },
  methods: {
    onInput() {
      this.$emit('search', this.query)
    },
    onSubmit() {
      this.$emit('search', this.query)
    }
  }
}
</script>
<style scoped>
.searchcontainer {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 5px;
}

.search {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-right: 20px;
}
.searchbox {
  font-family: 'Jura';
  font-size: 1rem;
  border-width: 1px;
  border-color: black;
  border-radius: 6px;
  border-width: 0px;
  padding: 3px;
}
.searchbutton {
  font-family: 'Jura';
  font-size: 1rem;
  font-weight: 600;
  background-color: rgb(46, 45, 45);
  color: white;
  border-width: 0;
  border-radius: 6px;
  padding: 3px;
}
</style>
