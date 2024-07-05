<template>
  <div class="about">
    <h2 class="title">Project Information</h2>
    <div id="content">
      <!-- <img class="logo" src="@/assets/check-box-svgrepo-com.svg" width="150" height="250" /> -->
      <h4>
        This is the client for a full stack web app that displays course credits transferred from
        sophia learning toward a bachelors degree of software engineering at wgu
      </h4>
      <h4 class="infotext">❍ Server written in Java ❍ Vue.js for front end ❍</h4>
      <h4 class="infotext">❍ Postgres for database ❍ Made by Joel Rennert ❍</h4>
      <h4 class="infotext"><a href="http://www.unorb.com">unorb.com</a></h4>
    </div>
  </div>
</template>

<style>
#content {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 10%;
  /* justify-content: space-evenly; */
  /* height: 100%; */
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

.title {
  font-weight: 200;
  font-size: 2.3rem;
  color: rgb(0, 0, 0);
}

.about {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  background: rgb(251, 246, 239);
  background-image: linear-gradient(to top, #bbbcbb 0%, #dce0d9 50%);
  background-size: cover;
  border-radius: 16px;
  margin-top: 5vh;
  margin-bottom: 5vh;
  /* height: 100vh; */
  background-size: cover;
  border-radius: 16px;
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(11.6px);
  -webkit-backdrop-filter: blur(11.6px);
}

h3 {
  font-size: 1rem;
  font-weight: 300;
  margin-bottom: 0.4rem;
  color: #000000;
}

h4 {
  font-size: 1rem;
  font-weight: 300;
  padding: 20px;
  /* padding: 10px; */
  color: #000000;
}

.infotext {
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 0.95rem;
  padding: 20px;
  /* padding: 10px; */
  color: #000000;
}
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
