import React, { Component } from "react";
import authService from "../services/authService";
import RewardsService from "./../services/rewardsService";
import UserItem from "./common/userItem";

class UserComponent extends Component {
  state = {
    user: {
      username: "",
      jwt: "",
      role: "",
    },
    rewards: 0,
    deals: [],
    coupons: [],
  };
  componentWillMount() {
    let user = authService.getCurrentUser();
    if (user === null) {
      let username = "";
      let jwt = "";
      let role = "";
      this.setState({ username, jwt, role });
    } else {
      this.setState({ user });
    }
  }
  componentDidMount() {
    RewardsService.getRewards(this.state.user.username)
      .then(({ data }) => {
        let rewards = data.rewards;
        this.setState({ rewards });
      })
      .catch(() => {
        let rewards = 0;
        this.setState({ rewards });
      });
    authService
      .getUserDetails(this.state.user.username)
      .then(({ data }) => {
        let deals = data.dealCodes;
        let coupons = data.couponCodes;
        this.setState({ deals, coupons });
      })
      .catch(() => {
        let deals = [];
        let coupons = [];
        this.setState({ deals, coupons });
      });
  }
  render() {
    return (
      <React.Fragment>
        <div className=" flex items-center justify-center">
          <div className="flex flex-col justify-center items-center">
            <h1 className="text-5xl md:text-7xl display py-20 text-transparent bg-clip-text bg-gradient-to-r from-red-500 to-indigo-500">
              Welcome {this.state.user.username}!
            </h1>
            <div className="nm-inset-gray-200 flex justify-center items-center p-20 rounded-lg">
              <div className="nm-flat-gray-200 rounded-full">
                <div className="w-32 h-32 bg-gradient-to-r from-red-500 to-pink-500  rounded-full flex items-center justify-center flex-col">
                  <h1 className="text-gray-200 text-sm">Rewards</h1>
                  <p className="text-gray-200 text-sm">{this.state.rewards}</p>
                </div>
              </div>
            </div>
            <div className="md:grid grid-cols-2 md:w-full">
              <div className="py-6 w-4/5">
                <div className="nm-inset-gray-200 flex justify-center items-center rounded-lg flex-col">
                  <h1 className="text-3xl py-4">Your Deals</h1>
                  <div className="flex flex-col space-y-4 py-2 w-3/5 my-8">
                    {this.state.deals.map((deal) => {
                      return (
                        <div>
                          <UserItem
                            key={deal}
                            title={deal}
                            rewards={100}
                            sign="+"
                            color="green"
                          />
                        </div>
                      );
                    })}
                  </div>
                </div>
              </div>
              <div className="py-6 w-4/5">
                <div className="nm-inset-gray-200 flex justify-center items-center rounded-lg flex-col">
                  <h1 className="text-3xl py-4">Your Coupons</h1>
                  <div className="flex flex-col space-y-4 py-2 w-3/5 my-8">
                    {this.state.coupons.map((coupon) => {
                      return (
                        <div>
                          <UserItem
                            key={coupon}
                            title={coupon}
                            rewards={100}
                            sign="-"
                            color="red"
                          />
                        </div>
                      );
                    })}
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default UserComponent;
