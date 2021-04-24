import React, { Component } from "react";
import { Link } from "react-router-dom";
import authService from "../services/authService";

class LogoutComponent extends Component {
  handleButton = () => {
    authService.logout();
    this.props.history.push("/");
    window.location.reload();
  };
  render() {
    return (
      <React.Fragment>
        <div className=" flex items-center justify-center">
          <div className="flex flex-col justify-center items-center">
            <h1 className="flex justify-center items-center text-6xl text-gray-600 lg:py-32 py-20 ">
              Are You Sure?
            </h1>
            <div className="flex space-x-4">
              <button className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg mb-20">
                <Link to="/">Go Home!</Link>
              </button>
              <button
                className="bg-gray-400 px-3 py-2 rounded text-gray-900 inline-block uppercase text-sm tracking-wider font-semibold mb-20 hover:bg-gray-300 transition duration-300 focus:outline-none"
                onClick={this.handleButton}
              >
                <Link to="/Login">Logout</Link>
              </button>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default LogoutComponent;
