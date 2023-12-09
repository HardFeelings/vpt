<script setup lang="ts">
import FormTitle from "../../UIHelpers/FormTitle.vue";
import {useFetch} from "@vueuse/core";

const { isFetching, error, data } = useFetch('http://localhost:5173/api/v1/reducerSeries').json()

</script>

<template>
  <FormTitle text="Серия" />

  <ul>
    <li v-for="series in data.data">
    {{series.seriesName}}
    {{series.nameForPrint}}
    </li>
  </ul>
</template>


<style scoped>
ul {
  margin-top: 10px;
  justify-content: center;
  align-items: center;
  display: flex;
}

li {
  width: 300px;
  height: 150px;
  display: flex;
}
</style>