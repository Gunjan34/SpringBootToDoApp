import axios from "axios";

const api = axios.create({
    baseURL: "http://13.201.0.25:8080/api/todos", //Spring Boot backend
});

export default api;
