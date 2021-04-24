import axios from "axios";
import AuthHeader from "./authHeader";

const LOGIN_URL = "http://localhost:8081/logIn";
const REGISTER_URL = "http://localhost:8081/signUp";
const USER_DETAILS_URL = "http://localhost:8081/user";
class AuthService {
  login(loginData) {
    return axios.post(LOGIN_URL, loginData).then(({ data }) => {
      // console.log(data);
      // if (data.data.jwt !== null) {
      localStorage.setItem("user", JSON.stringify(data));
      // }
      return data;
    });
  }

  logout() {
    localStorage.removeItem("user");
  }

  register(registerData) {
    return axios.post(REGISTER_URL, registerData);
  }

  getCurrentUser() {
    return JSON.parse(localStorage.getItem("user"));
  }

  getUserDetails(username) {
    return axios.get(`${USER_DETAILS_URL}/${username}`, {
      headers: AuthHeader(),
    });
  }
}

export default new AuthService();
