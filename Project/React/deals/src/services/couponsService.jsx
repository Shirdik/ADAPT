import axios from "axios";

// const COUPONS_BASE_URL = "http://localhost:8082/";
const ALL_COUPONS_URL = "http://localhost:8082/allCoupons";
class CouponsService {
  getCoupons() {
    return axios.get(ALL_COUPONS_URL);
  }
}
export default new CouponsService();
