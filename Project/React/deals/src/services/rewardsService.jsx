import axios from "axios";

const REWARDS_GET_URL = "http://localhost:8084/user/getRewards";

class RewardsService {
  getRewards(username) {
    return axios.get(`${REWARDS_GET_URL}/${username}`);
  }
}

export default new RewardsService();
