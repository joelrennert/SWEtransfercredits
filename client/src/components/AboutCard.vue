<template>
  <div class="itemCard">
    <h1 class="name">About</h1>
    <div class="aboutcontent">
      <div class="imageHeader">
        <img src="/src/assets/pencil-svgrepo-com.svg" width="200px" />
        <img src="/src/assets/macbook-pro-svgrepo-com.svg" width="200px" />
        <img src="/src/assets/8494639.png" width="200px" />
      </div>
      <div class="text">
        <p>
          A basic web app to keep track of courses to transfer toward a Software Engineering Degree
          at WGU
        </p>
        <p>Tools used:</p>
        <p>Java, Postgres, Vue.js</p>
      </div>
    </div>
  </div>
</template>
<script>
export default {}
</script>
<style scoped>
.imageHeader {
  display: flex;
}

.subtitle {
  font-style: italic;
}
.postmanimg {
  border-radius: 16px;
}

.postman {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 20px;
}

.features {
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  padding: 20px;
  flex-grow: 1;
  height: 100%;
}

.text {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 20px;
  line-height: 2.5;
}
.aboutcontent {
  display: flex;
  flex-direction: column;
  padding: 20px;
  gap: 20px;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.itemCard {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  flex-grow: 1;
  padding: 5px;
  margin: 10px;
  width: 95vw;
  height: 89vh;

  color: rgb(255, 255, 255);

  background: rgba(255, 255, 255, 0.116);
  border: 1px solid rgb(0, 0, 0);
  box-shadow: 5px 5px 6px 2px rgba(0, 0, 0, 0.2);
  background-color: #314c60;
}

.name {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-grow: 1;
  font-size: 1.4rem;
  color: rgba(255, 255, 255, 0.667);
  font-family: 'Jura';
  background-color: rgba(255, 255, 255, 0.23);
  padding: 6px;
  width: 100%;
  background-color: #314c60;
}
</style>
