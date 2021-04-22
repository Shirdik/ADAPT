import React, { Component } from "react";
import Deals from "../dealsComponent";
import DealAdderComponent from "./dealAdderComponent";
import DealUpdaterComponent from "./dealUpdaterComponent";
import RemoveDealComponent from "./removeDealComponent";

class AdminDealsComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="min-h-screen flex flex-col space-y-16">
          <div className="flex flex-col space-y-6 md:grid md:grid-cols-2 md:space-y-0">
            <DealAdderComponent />
            <DealUpdaterComponent />
          </div>
          <div className="">
            <RemoveDealComponent />
          </div>
          <Deals />
        </div>
      </React.Fragment>
    );
  }
}

export default AdminDealsComponent;
