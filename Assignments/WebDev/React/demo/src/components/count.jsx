import React, { Component } from "react";

class Counter extends Component {
  state = { count: 0, imageUrl: "https://picsum.photos/200" };
  render() {
    return (
      <React.Fragment>
        <span>
          <img src={this.state.imageUrl} alt="" />
        </span>
        <span className={this.getBadgeclasses()}>{this.formatCount()}</span>
        <button className="btn btn-primary">Increment</button>
      </React.Fragment>
    );
  }
  formatCount() {
    let { count } = this.state;
    return count === 0 ? <p>Zero</p> : count;
  }
  getBadgeclasses() {
    let classes = "badge m-3 badge-";
    return (classes += this.state.count === 0 ? "warning" : "primary");
  }
}

export default Counter;
