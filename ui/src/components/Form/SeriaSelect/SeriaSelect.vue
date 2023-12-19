<script setup lang="ts">
import FormTitle from "../../UIHelpers/FormTitle.vue";
import {useFetch} from "@vueuse/core";

const { data } = useFetch('http://localhost:5173/api/v1/reducerSeries').json()

</script>

<template>
  <FormTitle text="Серия" />

  <ul v-if="data !== null">
    <li v-for="series in data.data">
    <img src="series.imgPath" alt="reductor">
    <p>{{series.seriesName}}</p><p>{{series.nameForPrint}}</p>
    </li>
  </ul>
</template>


<style scoped>
ul {
  padding-top: 10px;
  justify-content: center;
  align-items: center;
  display: flex;
  gap: 10px;
}

li {
  display: flex;
  flex-direction: column;
  padding: 5px;
  width: 300px;
  height: 150px;
  border: 2px solid grey;
  justify-content: center;
  align-items: center;
}

li:hover {
  cursor: pointer;
}
</style>