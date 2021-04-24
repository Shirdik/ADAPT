import React from "react";
import Form from "./common/form";
import SignUp from "./icons/signUp";
import Facebook from "./icons/facebook";
import Instagram from "./icons/instagram";
import Twitter from "./icons/twitter";
import SimpleReactValidator from "simple-react-validator";
import authService from "../services/authService";
import Input from "./common/input";

class RegisterComponent extends Form {
  // componentWillMount() {
  //   this.validator = new SimpleReactValidator();
  // }
  constructor() {
    super();
    this.validator = new SimpleReactValidator();
  }
  handleChange = ({ target }) => {
    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };
  handleConfirmPassword = ({ target }) => {
    let { confirmPassword } = { ...this.state };
    confirmPassword = target.value;
    this.setState({ confirmPassword });
  };

  handleSubmit = () => {
    if (
      this.validator.allValid() &&
      this.state.data.password === this.state.confirmPassword
    ) {
      authService
        .register(this.state.data)
        .then(() => {
          alert("Registered Succesfully!");
          this.props.history.push("/Login");
        })
        .catch((e) => console.log(e));
    } else {
      this.validator.showMessages();
      this.forceUpdate();
    }
  };
  state = {
    data: {
      userName: "",
      firstName: "",
      lastName: "",
      email: "",
      password: "",
    },
    // checkBox: false,
    confirmPassword: "",
  };
  render() {
    const { data } = this.state;
    return (
      <div className="min-h-screen flex items-center justify-center ">
        <div className="nm-inset-gray-200 rounded-md w-4/5 sm:w-3/4 md:grid md:grid-cols-2 space-x-1 lg:w-1/2">
          <div className="hidden md:flex items-center bg-gray-300 rounded-l-md ml-1 my-1">
            <SignUp />
          </div>
          <div className="px-8 pt-2">
            <h1 className="text-3xl mb-4 text-center pt-2 ">
              Create Your Account
            </h1>
            <form className="">
              <div className="mt-2">
                {this.renderInput("userName", "Username")}
                {this.validator.message(
                  "username",
                  data.userName,
                  "required|alpha_num",
                  { className: "text-red-800" }
                )}
              </div>
              <div className="mt-2">
                {this.renderInput("firstName", "First Name")}
                {this.validator.message(
                  "First Name",
                  data.firstName,
                  "required|alpha",
                  { className: "text-red-800" }
                )}
              </div>
              <div className="mt-2">
                {this.renderInput("lastName", "Last Name")}
                {this.validator.message(
                  "LastName",
                  data.lastName,
                  "required|alpha",
                  { className: "text-red-800" }
                )}
              </div>
              <div className="mt-2">
                {this.renderInput("email", "Email")}
                {this.validator.message("Email", data.email, "required|email", {
                  className: "text-red-800",
                })}
              </div>
              <div>
                {this.renderInput("password", "Password", "password")}
                {this.validator.message(
                  "password",
                  data.password,
                  "required|alpha_num",
                  {
                    className: "text-red-800",
                  }
                )}
              </div>
              <div>
                <Input
                  name="confirmPassword"
                  value={this.state.confirmPassword}
                  label={"Confirm Password"}
                  onChange={this.handleConfirmPassword}
                  type={"password"}
                />
                {this.validator.message(
                  "password",
                  data.password,
                  "required|alpha_num",
                  {
                    className: "text-red-800",
                  }
                )}
              </div>
              <div className="mt-4 flex space-x-2 items-center justify-start">
                <input
                  name="agree"
                  type="checkbox"
                  className=" border-none rounded-sm w-3 h-3 focus:ring-yellow-500 ring-1 focus:outiline-none"
                />
                <label htmlFor="agree" className="text-xs text-gray-700">
                  I agree for the terms and Conditions
                </label>
              </div>
              <div
                to="/Login"
                className=" mt-4 px-3 py-2 rounded text-yellow-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-yellow-300 active:bg-yellow-500 hover:-translate-y-0.5 bg-yellow-400 cursor-pointer"
                onClick={this.handleSubmit}
              >
                Register
              </div>
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
