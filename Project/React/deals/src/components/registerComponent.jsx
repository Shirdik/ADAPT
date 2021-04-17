import React from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import Form from "./common/form";
import SignUp from "./icons/signUp";
import Facebook from "./icons/facebook";
import Instagram from "./icons/instagram";
import Twitter from "./icons/twitter";

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
      <div className="min-h-screen flex items-center justify-center">
        <div className="nm-inset-gray-200 rounded-md w-4/5 sm:w-3/4 md:grid md:grid-cols-2 space-x-1 lg:w-1/2">
          <div className="hidden md:flex items-center bg-gray-300 rounded-l-md ml-1 my-1">
            <SignUp />
          </div>
          <div className="px-8 pt-2">
            <h1 className="text-3xl mb-4 text-center pt-2">
              Create Your Account
            </h1>
            <form onSubmit={this.handleSubmit} className="">
              {this.renderInput("username", "Username")}
              {this.renderInput("firstName", "First Name")}
              {this.renderInput("lastName", "Last Name")}
              {this.renderInput("email", "Email")}
              {this.renderInput("password", "Password", "password")}
              {this.renderInput(
                "confirmPassword",
                "Confirm Password",
                "password"
              )}
              <div className="mt-4 flex space-x-2 items-center justify-start">
                <input
                  name="agree"
                  type="checkbox"
                  className=" border-none rounded-sm w-3 h-3 focus:ring-yellow-500 ring-1"
                />
                <label htmlFor="agree" className="text-xs text-gray-700">
                  I agree for the terms and Conditions
                </label>
              </div>
              <Link
                to="/Login"
                className=" mt-4 px-3 py-2 rounded text-yellow-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-yellow-300 active:bg-yellow-500 hover:-translate-y-0.5 bg-yellow-400"
                onClick={this.handleSubmit}
              >
                Register
              </Link>
              <div className="flex justify-around items-center my-8 -space-x-10">
                <div className="w-10 h-10 nm-flat-gray-200 rounded-full">
                  <Facebook />
                </div>
                <div className="nm-flat-gray-200 rounded-full">
                  <Instagram />
                </div>
                <div className="nm-flat-gray-200 rounded-full">
                  <Twitter />
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    );
  }
}

export default RegisterComponent;
