import React, { Component } from "react";
import DealModel from "./common/dealModel";
import dealsService from "../services/dealsService";
import LottieAnimation from "./lottie/lottieAnimation";
import loadingAnimation from "../components/lottie/loading.json";
import Pagination from "./common/paginagtion";
import { paginate } from "./common/paginate";

class Deals extends Component {
  componentWillMount() {
    let loading = true;
    this.setState({ loading });
    dealsService.getDeals().then(({ data }) => {
      this.setState({ data });
      loading = false;
      this.setState({ loading });
    });
  }
  handlepagechange = (page) => {
    this.setState({ currentPage: page });
  };
  state = {
    data: [],
    loading: false,
    currentPage: 1,
    pageSize: 6,
  };
  render() {
    const { length: count } = this.state.data;
    const { pageSize, currentPage, data: allproducts } = this.state;
    const data = paginate(allproducts, currentPage, pageSize);
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
            <div>
              <Pagination
                itemsCount={count}
                pageSize={pageSize}
                currentPage={currentPage}
                onPageChange={this.handlepagechange}
              />
              <div className="grid md:grid-cols-2 p-10 nm-inset-gray-200 mx-10 rounded-lg pattern">
                {data.map((deal) => {
                  return (
                    <div className="">
                      <DealModel
                        key={deal.dealCode}
                        dealCode={deal.dealCode}
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
              <Pagination
                itemsCount={count}
                pageSize={pageSize}
                currentPage={currentPage}
                onPageChange={this.handlepagechange}
              />
            </div>
          )}
          <div className="bg-gray-200 py-6"></div>
        </div>
      </div>
    );
  }
}

export default Deals;
