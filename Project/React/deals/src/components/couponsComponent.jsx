import React, { Component } from "react";
import ItemModel from "../models/itemModel";
import CouponsService from "../services/couponsService";

class Deals extends Component {
  componentDidMount() {
    CouponsService.getCoupons().then(({ data }) => this.setState({ data }));
  }
  state = {
    data: [],
  };
  render() {
    return (
      <div className="bg-gray-200 min-h-screen">
        <div className="">
          <h1 className=" text-5xl mb-10 text-center">Coupons</h1>
          <div className="grid md:grid-cols-2 p-10 nm-inset-gray-200 mx-10 rounded-lg pattern">
            {this.state.data.map((coupon) => {
              return (
                <div className="">
                  <ItemModel
                    key={coupon.id}
                    title={coupon.title}
                    description={coupon.description}
                    imageurl={coupon.imageurl}
                    link={coupon.link}
                    rewards={coupon.rewards}
                    category={coupon.category}
                    // couponCode={coupon.couponCode}
                  />
                </div>
              );
            })}
          </div>
        </div>
      </div>
    );
  }
}

export default Deals;
