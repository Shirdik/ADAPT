import React, { Component } from "react";


class Counter extends Component {
  render() {
    const {counter}=this.props;
    return (
      <React.Fragment>
        <div className="row">
        <div className="col-1">
        <span className={this.getBadgeclasses()}>{this.formatCount()}</span>
        </div>
        <div className="col">
        <button 
        className="btn btn-primary" 
        onClick={()=>this.props.onIncrement(counter)}>
          +
        </button>
        <button 
        className="btn btn-warning m-2" disabled={counter.value===0?'disabled':''} 
        onClick={()=>this.props.onDecrement(counter)}>
          -
        </button>
        <button 
        className="btn btn-danger" 
        onClick={() => this.props.onDelete(counter.id)}> 
          x
        </button>
        <br/>
        </div>
        </div>
      </React.Fragment>
    );
  }
  formatCount() {
    let { value } = this.props.counter;
    return value === 0 ? <span>Zero</span> : value;
  }
  getBadgeclasses() {
    let classes = "badge m-3 badge-";
    return (classes += this.props.counter.value === 0 ? "warning" : "primary");
  }
}

export default Counter;
