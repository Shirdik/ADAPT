import React, { Component } from "react";
import Input from "./input";

class Form extends Component {
  renderInput = (name, label, type = "text", classes = "") => {
    const { data } = this.state;
    return (
      <Input
        name={name}
        value={data[name]}
        label={label}
        onChange={this.handleChange}
        type={type}
        classes={classes}
      />
    );
  };
}

export default Form;
