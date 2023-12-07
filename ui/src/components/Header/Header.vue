<script setup>
import Button from "primevue/button";
</script>

<template>
  <header class="container">
    <img class="logo" src="./assets/vneshpromtorg_logo.png" alt="Logo" />
    <Button label="Сбросить" />
  </header>
</template>

<style scoped>
header {
  display: flex;
  padding-top: 10px;
  align-items: center;
  justify-content: space-between;
}

img {
  width: 150px;
  height: 100px;
}
</style>
