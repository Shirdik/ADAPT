import axios from "axios";
import userDetailsService from "./userDetailsService";

// const COUPONS_BASE_URL = "http://localhost:8082/";
const COUPONS_ALL_COUPONS = "http://localhost:8082/allCoupons";
const COUPONS_BY_ID = "http://localhost:8082/allDeals/ONEPLUS";
const COUPONS_ADD_COUPON = "http://localhost:8081/admin/addCoupon";
const COUPONS_EDIT_COUPON = "http://localhost:8081/admin/editCoupon";
const COUPONS_REMOVE_COUPON = "http://localhost:8081/admin/removeCoupon";
class CouponsService {
  getCoupons = () => {
    return axios.get(COUPONS_ALL_COUPONS);
  };
  getCoupon = async () => {
    return axios.get(COUPONS_BY_ID);
  };
  addCoupon = async (coupon) => {
    return axios.post(
      COUPONS_ADD_COUPON,
      coupon,
      userDetailsService.getHeader()
    );
  };
  editCoupon = async (coupon) => {
    return axios.put(
      COUPONS_EDIT_COUPON,
      coupon,
      userDetailsService.getHeader()
    );
  };
  removeCoupon = async (couponCode) => {
    return axios.delete(
      `${COUPONS_REMOVE_COUPON}/${couponCode}`,
      userDetailsService.getHeader()
    );
  };
}
export default new CouponsService();
