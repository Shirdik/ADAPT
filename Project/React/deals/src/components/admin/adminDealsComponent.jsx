import React, { Component } from "react";
import Deals from "../dealsComponent";
import DealAdderComponent from "./dealAdderComponent";
import DealUpdaterComponent from "./dealUpdaterComponent";

class AdminDealsComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="min-h-screen flex flex-col space-y-6">
          <div className="md:grid md:grid-cols-2">
            <DealAdderComponent />
            <DealUpdaterComponent />
          </div>
          <Deals />
        </div>
      </React.Fragment>
    );
  }
}

export default AdminDealsComponent;
