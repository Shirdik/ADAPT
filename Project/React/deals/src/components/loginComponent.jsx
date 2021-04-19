import React from "react";
import Form from "../components/common/form";
import { axios } from "axios";
import { Link } from "react-router-dom";
import SignIn from "./icons/signIn";
import Facebook from "./icons/facebook";
import Instagram from "./icons/instagram";
import Twitter from "./icons/twitter";
import LottieAnimation from "./lottie/lottieAnimation";
import signIn from "./lottie/signIn.json";

class Login extends Form {
  handleChange = ({ target }) => {
    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };

  handleSubmit = async () => {
    try {
      console.log(this.state.data);
      const { data: response } = await axios.post(
        "http://localhost:8081/logIn",
        this.state.data
      );
      console.log(response);
    } catch (e) {
      console.log(e);
    }
    // axios.post("http://localhost:8081/logIn", this.state.data).Response().Error(eer=>console.log(eer));
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
              {this.renderInput("username", "Username")}
              {this.renderInput("password", "Password", "password")}
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
