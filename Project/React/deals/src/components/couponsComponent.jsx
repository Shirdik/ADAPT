import React, { Component } from "react";
import CouponModel from "./common/couponModel";
import CouponsService from "../services/couponsService";
import LottieAnimation from "./lottie/lottieAnimation";
import loading from "./lottie/loading.json";

class Coupons extends Component {
  componentDidMount() {
    let loading = true;
    this.setState({ loading });
    CouponsService.getCoupons().then(({ data }) => {
      this.setState({ data });
      loading = false;
      this.setState({ loading: false });
    });
  }
  state = {
    data: [],
    loading: false,
  };
  render() {
    return (
      <div className="bg-gray-200 min-h-screen">
        <div className="">
          <h1 className=" text-5xl mb-10 text-center">Coupons</h1>
          {this.state.loading ? (
            <LottieAnimation lotti={loading} height={200} width={200} />
          ) : (
            <div className="grid md:grid-cols-2 p-10 nm-inset-gray-200 mx-10 rounded-lg pattern">
              {this.state.data.map((coupon) => {
                return (
                  <div className="">
                    <CouponModel
                      key={coupon.id}
                      title={coupon.title}
                      description={coupon.description}
                      imageurl={coupon.imageurl}
                      link={coupon.link}
                      rewards={coupon.rewards}
                      category={coupon.category}
                      couponCode={coupon.couponCode}
                      color="blue"
                      buttonText="Grab Now!"
                    />
                  </div>
                );
              })}
            </div>
          )}
        </div>
        <div className="bg-gray-200 py-6"></div>
      </div>
    );
  }
}

export default Coupons;
