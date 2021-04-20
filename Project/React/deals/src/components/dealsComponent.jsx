import React, { Component } from "react";
import ItemModel from "./common/itemModel";
import dealsService from "../services/dealsService";
import LottieAnimation from "./lottie/lottieAnimation";
import loadingAnimation from "../components/lottie/loading.json";

class Deals extends Component {
  componentDidMount() {
    let loading = true;
    this.setState({ loading });
    dealsService.getDeals().then(({ data }) => {
      this.setState({ data });
      loading = false;
      this.setState({ loading });
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
          <h1 className=" text-5xl mb-10 text-center">Deals</h1>
          {this.state.loading ? (
            <LottieAnimation
              lotti={loadingAnimation}
              height={200}
              width={200}
            />
          ) : (
            <div className="grid md:grid-cols-2 p-10 nm-inset-gray-200 mx-10 rounded-lg pattern">
              {this.state.data.map((deal) => {
                return (
                  <div className="">
                    <ItemModel
                      key={deal.id}
                      title={deal.title}
                      description={deal.description}
                      imageurl={deal.imageurl}
                      link={deal.link}
                      rewards={deal.rewards}
                      category={deal.category}
                      color="blue"
                      buttonText="Grab Now!"
                    />
                  </div>
                );
              })}
            </div>
          )}
          <div className="bg-gray-200 py-6"></div>
        </div>
      </div>
    );
  }
}

export default Deals;
