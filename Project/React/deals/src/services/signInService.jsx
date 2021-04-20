import axios from "axios";

const LOGIN_URL = "http://localhost:8081/logIn";
class loginService {
  signIn = async (userDetials) => {
    return axios.post(LOGIN_URL, userDetials);
  };
}

export default new loginService();
