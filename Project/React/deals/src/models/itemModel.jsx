import React, { Component } from "react";
import { Link } from "react-router-dom";

class ItemModel extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="card">
          <img src={this.props.imgurl} className="card-img-top" alt="..." />
          <div className="card-body">
            <h5 className="card-title">{this.props.title}</h5>
            <p className="card-text">{this.props.description}</p>
          </div>
          <ul className="list-group list-group-flush">
            <li className="list-group-item">{this.props.rewards}</li>
          </ul>
          <div className="card-body">
            <Link to="#" className="card-link">
              Card link
            </Link>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default ItemModel;
