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
                <p className="my-3 ">
                  <span className=" ">Rewards</span>
                  {this.props.rewards}
                </p>
                <div className="">
                  <a
                    className="bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5"
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
