import React from "react";
import axios from "axios";
import Form from "./common/form";
class RegisterComponent extends Form {
  handleChange = ({ target }) => {
    // console.log();
    // console.log(target.name);
    // console.log(target.value);

    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };

  handleSubmit = () => {
    axios.post("http://localhost:8081/signUp", this.state.data);
  };
  state = {
    data: {
      username: "",
      firstName: "",
      lastName: "",
      email: "",
      password: "",
    },
  };
  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        {this.renderInput("username", "Username")}
        {this.renderInput("firstName", "FirstName")}
        {this.renderInput("lastName", "LastName")}
        {this.renderInput("email", "Email")}
        {this.renderInput("password", "Password", "password")}
        {this.renderInput("confirmPassword", "ConfirmPassword", "password")}
        {this.renderButton("Register")}
      </form>
    );
  }
}

export default RegisterComponent;
