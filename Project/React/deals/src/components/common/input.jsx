import React, { Component } from "react";
import SimpleReactValidator from "simple-react-validator";
class Input extends Component {
  componentWillMount() {
    this.validator = new SimpleReactValidator();
  }
  render() {
    return (
      <React.Fragment>
        <label htmlFor={this.props.name} className="font-semibold">
          {this.props.label}
        </label>
        <input
          name={this.props.name}
          label={this.props.label}
          id={this.props.name}
          value={this.props.value}
          onChange={this.props.onChange}
          className={`form-control nm-flat-gray-200-sm border-none rounded-lg inline-block w-full mt-1 focus:nm-inset-gray-200-sm p-1 ${this.props.classes}`}
        />
      </React.Fragment>
    );
  }
}

export default Input;
