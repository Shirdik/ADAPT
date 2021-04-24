import axios from "axios";
import AuthHeader from "./authHeader";

const DEALS_ALL_DEALS = "http://localhost:8083/allDeals";
const DEALS_ADD_DEAL = "http://localhost:8081/admin/addDeal";
const DEALS_EDIT_DEAL = "http://localhost:8081/admin/editDeal";
const DEALS_REMOVE_DEAL = "http://localhost:8081/admin/removeDeal";
const DEALS_GRAB_DEAL = "http://localhost:8081/user/grabDeal";

class DealsService {
  getDeals = async () => {
    return axios.get(DEALS_ALL_DEALS);
  };
  getDeal = async (dealCode) => {
    let x = await axios.get(`${DEALS_ALL_DEALS}/${dealCode}`);
    return x;
  };
  addDeal = async (deal) => {
    return axios.post(DEALS_ADD_DEAL, deal, { headers: AuthHeader() });
  };
  garbDeal = async (username, dealCode) => {
    return axios.put(`${DEALS_GRAB_DEAL}/${username}/${dealCode}`, null, {
      headers: AuthHeader(),
    });
  };
  editDeal = async (deal) => {
    return axios.put(DEALS_EDIT_DEAL, deal, { headers: AuthHeader() });
  };
  removeDeal = async (dealCode) => {
    return axios.delete(`${DEALS_REMOVE_DEAL}/${dealCode}`, {
      headers: AuthHeader(),
    });
  };
}

export default new DealsService();
