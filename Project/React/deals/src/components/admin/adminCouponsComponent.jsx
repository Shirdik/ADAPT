import React, { Component } from "react";
import Coupons from "../couponsComponent";
import CouponAdderComponent from "./couponAdderComponent";
import CouponUpdaterComponent from "./couponUpdaterComponent";

class AdminDealsComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="min-h-screen flex flex-col space-y-6">
          <div className="md:grid md:grid-cols-2 my-10">
            <CouponAdderComponent />
            <CouponUpdaterComponent />
          </div>
          <Coupons />
        </div>
      </React.Fragment>
    );
  }
}

export default AdminDealsComponent;
