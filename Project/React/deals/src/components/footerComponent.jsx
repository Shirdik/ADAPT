import React, { Component } from "react";
import { Link } from "react-router-dom";
import Facebook from "./icons/facebook";
import Instagram from "./icons/instagram";
import Twitter from "./icons/twitter";

class FooterComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="min-h-32 nm-flat-gray-300 pb-3 rounded-lg ">
          <div className="">
            <div className="grid grid-cols-2 items-center justify-around lg:grid-cols-3">
              <div className="flex flex-col space-y-5 items-center justify-around">
                <h1 className="font-semibold text-gray-600">Navigation</h1>
                <ul className="flex flex-col space-y-2">
                  <li className="text-gray-700 text-sm">
                    <Link to="/home" />
                    Home
                  </li>
                  <li className="text-gray-700 text-sm">
                    <Link to="/Deals" />
                    Deals
                  </li>
                  <li className="text-gray-700 text-sm">
                    <Link to="/Coupons" />
                    Coupons
                  </li>
                  <li className="text-gray-700 text-sm">
                    <Link to="/LogIn" />
                    Login
                  </li>
                  <li className="text-gray-700 text-sm">
                    <Link to="/SignUp" />
                    SignUp
                  </li>
                </ul>
              </div>
              <div className="hidden lg:flex flex-col items-center justify-center">
                <h1 className="text-gray-700 text-2xl">About</h1>
                <p className="text-gray-600 text-sm pt-4 text-justify italic">
                  We provide a seamless experience to the users to buy the best
                  deals in the market from daily-essentials to special gifts to
                  their loved ones at lowest price possible. Users gains rewards
                  for buying deals from our website which can be redeemed by
                  grabing coupouns in our site which are applicable in all the
                  popular shopping sites
                </p>
              </div>
              <div className="flex flex-col justify-around items-center my-10 space-y-10">
                <div className="w-10 h-10 nm-flat-gray-200 rounded-full">
                  <Facebook />
                </div>
                <div className="nm-flat-gray-200 rounded-full">
                  <Instagram />
                </div>
                <div className="nm-flat-gray-200 rounded-full">
                  <Twitter />
                </div>
              </div>
            </div>
            <div className="flex flex-col items-center justify-around mx-2 rounded-3xl space-y-2 lg:flex-row ">
              <div className="text-gray-700 text-sm ">Privacy Policy</div>
              <div className="text-gray-700 text-sm">
                <span className="mx-1">&#169;</span>
                2021 Grab 'n' Go Shopping
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default FooterComponent;
