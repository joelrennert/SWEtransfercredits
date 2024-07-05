<script setup>
import TheWelcome from '../components/TheWelcome.vue'
// import AllCourses from '../components/AllCourses.vue'
import CourseService from '@/services/CourseService';
</script>

<template>
  <main>
    <TheWelcome />
    <!-- <AllCourses/> -->
  </main>
</template>


<script>
export default {
  components: {
    // AllCourses
 
  },
  data() {
    return {
      gearArray: [],
      filteredGearArray: [],
      filter: '',
      isLoading: true
    }
  },
  methods: {
    getGearItems() {
      this.isLoading = true
      CourseService.list()
        .then((response) => {
          this.gearArray = response.data
          this.filteredGearArray = response.data
          this.isLoading = false
          console.log(this.gearArray)
        })
        .catch((error) => {
          this.handleError(error)
        })
    },
    handleError(error) {
      this.isLoading = false
      console.log(error)
    },
  }
}
</script>

<style>
main {
  /* color: white; */

  display: flex;
  flex-direction: column;
  justify-content: space-between;
  margin-top: 5vh;
  margin-bottom: 30px;
  padding-top: 50px;
  height: 100%;

  background-image: linear-gradient(to top, #bbbcbb 0%, #dce0d9 50%);


  /* background: rgb(251,246,239);
  background: linear-gradient(0deg, rgb(132, 150, 141) 10%, rgb(92, 103, 97) 90%);   */

  /* background: rgb(251, 246, 239); */
  /* background: linear-gradient(0deg, rgb(252, 246, 233) 0%, rgb(206, 194, 172) 100%);   */
  /* background: linear-gradient(0deg, rgb(228, 215, 191) 0%, rgb(245, 241, 231) 100%); */


  /* background: rgb(251,246,239);
  background: linear-gradient(0deg, rgb(141, 141, 140) 10%, rgb(92, 103, 97) 100%);   */

  /* background: rgba(0,0,0,0.56); */
  /* background-image: linear-gradient(to top, #c2c2c1 0%, #ededed 100%);
  
  background-size: cover;
  border-radius: 16px;
  box-shadow: 0 4px 30px rgba(0,0,0,0.1);
  backdrop-filter: blur(11.6px);
  -webkit-backdrop-filter: blur(11.6px); */

  /* glass container */
  /* background: rgba(133, 148, 151, 0.8); */
  border-radius: 16px;
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(2.8px);
  -webkit-backdrop-filter: blur(2.8px);
}
</style>
