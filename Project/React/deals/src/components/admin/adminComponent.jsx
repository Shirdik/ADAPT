import React, { Component } from "react";
import { Link } from "react-router-dom";

class AdminComponent extends Component {
  render() {
    return (
      <React.Fragment>
        <div className=" flex items-center justify-center">
          <div className="flex flex-col justify-center items-center">
            <h1 className="text-6xl text-transparent bg-clip-text bg-gradient-to-r to-red-500 from-indigo-500 display lg:py-32 py-20 ">
              Welcome Admin!
            </h1>
            <div className="flex text-gray-600 text-sm tracking-wider pb-4">
              Wanna Update Things?
            </div>
            <div className="flex space-x-4">
              <button className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg  mb-20">
                <Link to="/DealsEditor">Deals</Link>
              </button>
              <button className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg  mb-20">
                <Link to="/CouponsEditor">Coupons</Link>
              </button>
            </div>
            {/* <button className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 shadow-lg w-1/5 mb-20">
              <Link to="/Users">Users</Link>
            </button> */}
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default AdminComponent;
