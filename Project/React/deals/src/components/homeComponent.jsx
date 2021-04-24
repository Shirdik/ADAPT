import React, { Component } from "react";
import DealModel from "./common/dealModel";
import DealsService from "../services/dealsService";
import LottieAnimation from "./lottie/lottieAnimation";
import home from "./lottie/home.json";
import loadingAnimation from "./lottie/loading.json";

class HomeComponent extends Component {
  componentWillMount() {
    let loading = true;
    this.setState({ loading });
    DealsService.getDeal("ONEPLUS").then(({ data }) => {
      this.setState({ data });
      loading = false;
      this.setState({ loading });
    });
  }
  state = {
    loading: false,
  };
  render() {
    return (
      <React.Fragment>
        <div className="min-h-screen flex flex-col justify-center items-center">
          {this.state.loading ? (
            <LottieAnimation
              lotti={loadingAnimation}
              height={200}
              width={200}
            />
          ) : (
            <div className="">
              <div className="flex flex-col justify-center items-center">
                <div className="lg:flex items-center justify-center">
                  <div className="hidden lg:inline-flex">
                    <LottieAnimation lotti={home} height={200} width={200} />
                  </div>
                  <div className="text-transparent bg-gradient-to-r bg-clip-text text-6xl from-indigo-500 to-pink-500 font-bold display lg:text-8xl lg:py-32 py-20">
                    Grab 'n' Go
                  </div>
                </div>
                <div className="lg:flex items-center nm-flat-gray-300">
                  <h1 className="hidden lg:inline-block absolute text-3xl mb-64 mx-72">
                    About
                  </h1>
                  <div className="text-gray-600 italic my-6 w-4/5 text-justify lg:w-1/2 lg:ml-20 ml-12">
                    We provide a seamless experience to the users to buy the
                    best deals in the market from daily-essentials to special
                    gifts to their loved ones at lowest price possible. Users
                    gains rewards for buying deals from our website which can be
                    redeemed by grabing coupouns in our site which are
                    applicable in all the popular shopping sites
                  </div>
                  <div className="flex justify-center">
                    <div className="grid p-10 nm-inset-gray-200 mx-10 rounded-lg pattern my-10 lg:w-4/5">
                      <div className="">
                        <DealModel
                          key={this.state.data.id}
                          title={this.state.data.title}
                          description={this.state.data.description}
                          imageurl={this.state.data.imageurl}
                          link={this.state.data.link}
                          rewards={this.state.data.rewards}
                          category={this.state.data.category}
                          color="blue"
                          buttonText="Grab Now!"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>

              {/* Brands */}
              <div className="flex flex-col items-center justify-around py-4 w-full lg:py-16 lg:space-y-5 pattern-1 my-2">
                <p className="text-2xl py-4 nm-inset-gray-200 rounded-lg px-10 ">
                  Our Partners
                </p>
                <div className="flex items-center justify-around space-x-4 pt-6 w-4/5">
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center">
                    <img
                      className="relative pt-1"
                      src="https://logodownload.org/wp-content/uploads/2014/04/amazon-logo.png"
                      alt="amazon"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center">
                    <img
                      className="relative "
                      src="https://logos-download.com/wp-content/uploads/2016/09/Flipkart_logo.png"
                      alt="Flipkart"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative pt-1"
                      src="https://logos-download.com/wp-content/uploads/2016/09/Myntra_logo.png"
                      alt="Myntra"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-1 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative "
                      src="https://1000logos.net/wp-content/uploads/2020/07/Ajio-Logo.png"
                      alt="Ajio"
                    />
                  </div>
                </div>
                <div className="flex w-4/5 items-center justify-around space-x-4 pt-4">
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative "
                      src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Paytm_Logo_%28standalone%29.svg/1200px-Paytm_Logo_%28standalone%29.svg.png"
                      alt="Paytm"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative"
                      src="https://pngimg.com/uploads/ebay/ebay_PNG9.png"
                      alt="Ebay"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative py-1"
                      src="https://logos-download.com/wp-content/uploads/2016/10/SnapDeal_logo_pink.png"
                      alt="Snapdeal"
                    />
                  </div>
                  <div className="nm-flat-gray-200 rounded-3xl w-24 h-15 px-2 py-2 lg:w-44 lg:h-16 flex items-center ">
                    <img
                      className="relative py-1"
                      src="https://img2.pngio.com/shopcluescom-raises-100-million-tiger-global-invests-in-shopclues-png-2560_661.png"
                      alt="Shopclues"
                    />
                  </div>
                </div>
              </div>
            </div>
          )}
        </div>
      </React.Fragment>
    );
  }
}

export default HomeComponent;
