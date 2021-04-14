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
      <div>
        <h1 className="display-4">Deals Component</h1>
        {this.state.data.map((deal) => {
          return (
            <ItemModel
              key={deal.id}
              title={deal.title}
              description={deal.description}
              imgurl={deal.imgurl}
              link={deal.link}
              rewards={deal.rewards}
              category={deal.category}
            />
          );
        })}
      </div>
    );
  }
}

export default Deals;
