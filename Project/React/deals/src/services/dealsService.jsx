import axios from "axios";
import userDetailsService from "./userDetailsService";

// const DEALS_BASE_URL = "http://localhost:8083/";
const DEALS_ALL_DEALS = "http://localhost:8083/allDeals";
const DEALS_BY_ID = "http://localhost:8083/allDeals/ONEPLUS";
const DEALS_ADD_DEAL = "http://localhost:8081/admin/addDeal";
const DEALS_EDIT_DEAL = "http://localhost:8081/admin/editDeal";
const DEALS_REMOVE_DEAL = "http://localhost:8081/admin/removeDeal";

class DealsService {
  getDeals = async () => {
    return axios.get(DEALS_ALL_DEALS);
  };
  getDeal = async () => {
    return axios.get(DEALS_BY_ID);
  };
  addDeal = async (deal) => {
    return axios.post(DEALS_ADD_DEAL, deal, userDetailsService.getHeader());
  };
  editDeal = async (deal) => {
    return axios.put(DEALS_EDIT_DEAL, deal, userDetailsService.getHeader());
  };
  removeDeal = async (dealCode) => {
    return axios.delete(
      `${DEALS_REMOVE_DEAL}/${dealCode}`,
      userDetailsService.getHeader()
    );
  };
}

export default new DealsService();
