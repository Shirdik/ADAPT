import React from "react";
import Form from "../components/common/form";
import { axios } from "axios";
import { Link } from "react-router-dom";

class Login extends Form {
  handleChange = ({ target }) => {
    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };

  handleSubmit = () => {
    axios.post("http://localhost:8081/logIn", this.state.data);
  };
  state = {
    data: {
      username: "",
      password: "",
    },
  };
  render() {
    return (
      <div className="pattern">
        <h1 className="text-3xl text-center pt-2">Sign In</h1>
        <div className="nm-inset-gray-200 rounded-md inline-block p-8 mx-20 my-6">
          <form onSubmit={this.handleSubmit} className="">
            {this.renderInput("username", "Username")}
            {this.renderInput("password", "Password", "password")}
            <Link
              to="/Login"
              className="mt-6 bg-indigo-500 text-white px-5 py-3 inline-block shadow-lg rounded-3xl uppercase tracking-wider text-sm font-semibold hover:bg-indigo-400 hover:-translate-y-0.5 transform transition focus: outline-none focus: ring foucs: ring-offset-2 focus: ring-indigo-500 focus:ring-opacity-50 active:bg-indigo-600"
              onClick={this.handleSubmit}
            >
              Log In
            </Link>
          </form>
        </div>
      </div>
    );
  }
}

export default Login;
