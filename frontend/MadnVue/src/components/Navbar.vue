<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <router-link class="navbar-brand" to="/">Mensch Ärgere dich nicht</router-link>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav" >
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link to="/" class="nav-link">Home</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/playerSelect" class="nav-link">New Game</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/board" class="nav-link">Spielfeld</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/about" class="nav-link">About</router-link>
        </li>
        <li class="nav-item">
          <a href="https://github.com/Manz2/WApp-Madm" target="_blank" class="nav-link">Github</a>
        </li>
      </ul>
    </div>
  </nav>
</template>


<style scoped>
    .navbar-brand{
        margin-left: 10px;
        background: rgba(0,0,0,0.15);
        padding: 4px 10px 4px 10px;
        border-radius: 8px;
    }
    .navbar-brand:hover {
      background: rgba(0,0,0,0.2);
    }
    #navbarNav{
        justify-content:center;
        margin-left: 30px;
        margin-right: 30px;;
    
    }
    #navbarNav ul{
        display: flex;
        justify-content: space-around;
        width: 100%;
    }

    .nav-item:hover{
      text-decoration: underline;
      text-decoration-color: #007bff; 
    }

</style>
