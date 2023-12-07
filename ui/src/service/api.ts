import { defineStore } from "pinia";
import {Reducer} from "./types.ts";
import axios from "axios";

export const conductorStore = defineStore("reductors", {
  state: () => ({}),
});

export function getReducers(): Reducer[] {
  axios.get('http://localhost:5173/api/v1/reducerSeries').then(() => {
  })

  return [];
}