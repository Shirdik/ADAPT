import React, { Component } from "react";
import Input from "./input";

class Form extends Component {
  // Validate Function
  //   validate = () => {
  //     const options = {
  //       abortEarly: false,
  //     };
  //     const { error } = Joi.validate(this.state.account, this.schema, options);

  //     console.log(error);

  //     // if (!error) return null;
  //     // const errors = {};
  //     // for (let item of error.details) errors[item.path[0]] = item.message;
  //     // return errors;
  //   };

  // validateProperty = ({ name, value }) => {
  //   const obj = { [name]: value };
  //   const schema = { [name]: this.schema[name] };
  //   const { error } = Joi.validate(obj, schema);
  //   return error ? error.details.message[0] : null;
  // };

  //   handleUsername = ({ currentTarget: input }) => {
  //     const errors = { ...this.state.errors };
  //     // const errorMessage = this.validateProperty(input);
  //     // if (errorMessage) errors[input.name] = errorMessage;
  //     const account = { ...this.state.account };
  //     account.username = input.value;
  //     this.setState({ account, errors });
  //   };

  //   handlePassword = (e) => {
  //     const account = { ...this.state.account };
  //     account.password = e.currentTarget.value;
  //     this.setState({ account });
  //   };

  // handleChange = ({ currentTarget: input }) => {
  //   const data = { ...this.state.data };
  //   data[input.name] = input.value;
  //   this.setState({ data });
  // };

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
