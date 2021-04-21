import React, { Component } from "react";
import { Link } from "react-router-dom";
import authService from "../services/authService";

class LogoutComponent extends Component {
  handleButton = () => {
    authService.logout();
  };
  render() {
    return (
      <React.Fragment>
        <div className=" flex items-center justify-center">
          <div className="flex flex-col justify-center items-center">
            <h1 className="text-6xl text-gray-700 display lg:py-32 py-20 ">
              Logged Out Successfully!
            </h1>
            <div className="flex space-x-4">
              <button
                className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg mb-20"
                onClick={this.handleButton}
              >
                <Link to="/">Go Home!</Link>
              </button>
              <button
                className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg mb-20"
                onClick={this.handleButton}
              >
                <Link to="/Login">SignIn</Link>
              </button>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default LogoutComponent;
