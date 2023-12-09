import { defineStore } from "pinia";

export const conductorStore = defineStore("reductors", {
  state: () => ({}),
});

export const reducerSeries = async () => {
  const response =  await axios.get('http://localhost:5173/api/v1/reducerSeries')
  return response.data.data
}
