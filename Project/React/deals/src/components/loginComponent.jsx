import React from "react";
import Form from "../components/common/form";
import { Link, Redirect } from "react-router-dom";
import Facebook from "./icons/facebook";
import Instagram from "./icons/instagram";
import Twitter from "./icons/twitter";
import LottieAnimation from "./lottie/lottieAnimation";
import signIn from "./lottie/signIn.json";
import signInService from "../services/signInService";
import SimpleReactValidator from "simple-react-validator";
import userDetailsService from "../services/userDetailsService";

class Login extends Form {
  componentWillMount() {
    this.validator = new SimpleReactValidator();
  }
  handleChange = ({ target }) => {
    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };

  handleSubmit = async () => {
    try {
      if (this.validator.allValid()) {
        const { data: result } = await signInService.signIn(this.state.data);
        if (result.response === "Authentication Succesful!") {
          userDetailsService.setUserDetails(this.state.username, result.jwt);
          alert("Logged In Successfully");
          <Redirect to="/" />;
        } else {
          alert("Bad credentials");
        }
      } else {
        this.validator.showMessages();
        this.forceUpdate();
      }
    } catch (e) {
      console.log(e);
    }
  };
  state = {
    data: {
      username: "",
      password: "",
    },
  };
  render() {
    return (
      <div className="min-h-screen flex items-center justify-center">
        <div className="nm-inset-gray-200 rounded-md w-4/5 p-8  my-6 sm:3/5 sm:grid sm:grid-cols-2 space-x-1 sm:p-0 mb-32 lg:w-1/2">
          <div className="hidden sm:flex items-center bg-gray-300 rounded-l-sm ml-1 my-1 justify-center">
            {/* <SignIn />
             */}
            <LottieAnimation lotti={signIn} height={250} width={250} />
          </div>
          <div className="sm:p-8">
            <h1 className="text-3xl mb-4 text-center pt-2">Sign In</h1>
            <form className="">
              <div className="mt-2">
                {this.renderInput("username", "Username")}
                {this.validator.message(
                  "username",
                  this.state.data.username,
                  "required|alpha",
                  { className: "text-red-800" }
                )}
              </div>
              <div className="mt-2">
                {this.renderInput("password", "Password", "password")}
                {this.validator.message(
                  "password",
                  this.state.data.password,
                  "required|alpha",
                  { className: "text-red-800" }
                )}
              </div>
              <div className="flex items-center mt-6 space-x-2">
                <div
                  className=" bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5"
                  onClick={this.handleSubmit}
                >
                  Login
                </div>
                <Link to="/forgot" className=" text-sm text-gray-700">
                  forgot password?
                </Link>
              </div>
            </form>
            <div className="flex justify-around items-center my-10 -space-x-10">
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
          </div>
        </div>
      </div>
    );
  }
}

export default Login;
