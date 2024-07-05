<template>
  <main>
    <header>
      <div class="wrapper">
        <HelloWorld msg="transfer credits" />

        <div class="search">
          <NavItems />
          <div class="h4title">
            <h4>SOFTWARE ENGINEERING TRANSFER CREDITS</h4>
          </div>
          <div class="blank"></div>
        </div>
      </div>
    </header>

    <div class="cardscontainer">
      <CoursesTable :courseArray="courseArray" />
    </div>
  </main>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import HelloWorld from '../components/HelloWorld.vue'
import NavItems from '../components/NavItems.vue'
import CoursesTable from '../components/CoursesTable.vue'
import CourseService from '../services/CourseService'

const courseArray = ref([])
const isLoading = ref(true)

const getCourses = () => {
  isLoading.value = true
  CourseService.list()
    .then((response) => {
      courseArray.value = response.data
      isLoading.value = false
      console.log(courseArray.value)
    })
    .catch((error) => {
      console.error('Error fetching courses:', error)
      isLoading.value = false
    })
}

onMounted(getCourses)
</script>

<style scoped>
.blank {
  width: 30%;
}

.h4title {
  display: flex;
  font-family: 'Jura';
  
  font-size: 1.4rem;
  color: rgb(255, 255, 255);
  color: #ffffff;
  padding: 3px;
  width: 100%;
  flex-grow: 4;
  align-items: center;
  justify-content: space-evenly;
}
.titleimage {
  display: flex;
  justify-content: space-evenly;
  flex-grow: 1;
  width: 80%;
  /* padding: 5px; */
}
.cardscontainer {
  display: flex;
  flex-direction: row;
  justify-content: center;
  /* flex-wrap: wrap; */
  /* margin-top: 20px;
  margin-bottom: 50px; */
  width: 100vw;
}
main {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.wrapper {
  display: flex;
  justify-content: center;
  line-height: 1.5;
  flex-grow: 1;
}

@media (min-width: 768px) {
  header {
    display: flex;
    justify-content: center;
    place-items: center;
    flex-grow: 1;
    position: sticky;
    top: 0;
    z-index: 10;
    width: 100vw;
    height: 10%;
    /* border-bottom-right-radius: 12px;
     border-bottom-left-radius: 12px;  */
    box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
    backdrop-filter: blur(5px);
    -webkit-backdrop-filter: blur(5px);
    border: 1px solid rgb(0, 0, 0);
    border-top-width: 0;
    backdrop-filter: blur(5px);
    -webkit-backdrop-filter: blur(5px);
    box-shadow: 5px 5px 6px 2px rgba(0, 0, 0, 0.2);
    background: #6c9ec4;
    background: #232323c7;
  }
  .navsearchcontainer {
    display: flex;
    justify-content: space-between;
    width: 100%;
    flex-grow: 1;
    align-items: center;
  }
  .logo {
    margin: 0 2rem 0 0;
  }
  header .wrapper {
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    flex-grow: 2;
  }

  .search {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-right: 20px;
  }
  .searchbox {
    font-family: 'Jura';
    font-size: 0.8rem;
    border-radius: 6px;
    border-width: 0px;
    padding: 5px;
  }
  .searchbutton {
    font-family: 'Jura';
    font-size: 0.8rem;
    font-weight: 600;
    border-width: 0;
    border-radius: 6px;
    padding: 5px;
  }
}
</style>
