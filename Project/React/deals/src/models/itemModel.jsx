import React, { Component } from "react";

class ItemModel extends Component {
  render() {
    return (
      <React.Fragment>
        <div className="border border-grey-600 rounded-xl nm-flat-gray-200-lg m-5">
          <div className="grid lg:grid-cols-2">
            <div className="hidden relative lg:block rounded-l-lg bg-gray-300 lg:col">
              <img
                src={this.props.imageurl}
                className="inset-0 absolute w-full h-full object-cover object-center rounded-3xl"
                alt={this.props.title}
              />
            </div>
            <div>
              <div className="rounded-t-lg bg-gray-300">
                <img
                  src={this.props.imageurl}
                  className="object-fill object-center lg:hidden "
                  alt={this.props.title}
                />
              </div>

              <div className="col p-8  max-w-md mx-auto lg:px-12 lg:py-24">
                <h5 className="text-2xl font-bold text-gray-900">
                  {this.props.title}
                </h5>
                <p className="mt-2 text-grey-600 max-w-auto line-clamp-3 hover:line-clamp-none">
                  {this.props.description}
                </p>
                <p className="mt-3 ">
                  <span className=" ">Rewards</span>
                  {this.props.rewards}
                </p>
                <div className="">
                  <a
                    className="mt-6 bg-indigo-500 text-white px-5 py-3 inline-block shadow-lg rounded uppercase tracking-wider text-sm font-semibold hover:bg-indigo-400 hover:-translate-y-0.5 transform transition focus: outline-none focus: ring foucs: ring-offset-2 focus: ring-indigo-500 focus: ring-opacity-50 active:bg-indigo-600"
                    href={this.props.link}
                    target="_blank"
                    rel="noreferrer"
                  >
                    Grab Now!
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default ItemModel;
