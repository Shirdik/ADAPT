import React, { Component } from "react";
import Coupons from "../couponsComponent";
import CouponAdderComponent from "./couponAdderComponent";
import CouponUpdaterComponent from "./couponUpdaterComponent";
import RemoveCouponComponent from "./removeCouponComponent";

class AdminDealsComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="min-h-screen flex flex-col space-y-16">
          <div className="flex flex-col space-y-6 md:grid md:grid-cols-2 md:space-y-0">
            <CouponAdderComponent />
            <CouponUpdaterComponent />
          </div>
          <RemoveCouponComponent />
          <Coupons />
        </div>
      </React.Fragment>
    );
  }
}

export default AdminDealsComponent;
