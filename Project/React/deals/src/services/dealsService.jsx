import axios from "axios";

// const DEALS_BASE_URL = "http://localhost:8083/";
const DEALS_ALL_DEALS = "http://localhost:8083/allDeals";
const DEALS_BY_ID = "http://localhost:8083/allDeals/ONEPLUS";
class DealsService {
  getDeals = async () => {
    return axios.get(DEALS_ALL_DEALS);
  };
  getDeal = async () => {
    return axios.get(DEALS_BY_ID);
  };
}

export default new DealsService();
