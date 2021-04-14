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
      <div>
        <h1 className="display-4">Coupons Component</h1>
        {this.state.data.map((coupon) => {
          return (
            <ItemModel
              key={coupon.id}
              title={coupon.title}
              description={coupon.description}
              imgurl={coupon.imgurl}
              link={coupon.link}
              rewards={coupon.rewards}
              category={coupon.category}
            />
          );
        })}
      </div>
    );
  }
}

export default Deals;
