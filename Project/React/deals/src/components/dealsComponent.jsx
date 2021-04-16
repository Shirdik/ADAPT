import React, { Component } from "react";
import ItemModel from "../models/itemModel";
import dealsService from "../services/dealsService";

class Deals extends Component {
  componentDidMount() {
    dealsService.getDeals().then(({ data }) => this.setState({ data }));
  }
  state = {
    data: [],
  };
  render() {
    return (
      <div className="bg-gray-200">
        <div className="">
          <h1 className=" text-5xl mb-10">Deals Component</h1>
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
