import axios from "axios";

// const DEALS_BASE_URL = "http://localhost:8083/";
const DEALS_ALL_DEALS = "http://localhost:8083/allDeals";
class DealsService {
  getDeals() {
    return axios.get(DEALS_ALL_DEALS);
  }
}

export default new DealsService();
