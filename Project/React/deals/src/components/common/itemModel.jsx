import React, { Component } from "react";
// import DialogBox from "../components/common/dialogBox";

class ItemModel extends Component {
  state = {
    open: false,
  };
  handleButton = () => {
    const open = true;
    this.setState({ open });
  };
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

              <div className="col p-6 lg:p-8  max-w-md mx-auto">
                <h1 className="text-2xl  text-blue-900">{this.props.title}</h1>
                <p className="my-2 text-grey-600 line-clamp-3 lg:line-clamp-5 hover:line-clamp-none lg:py-4 text-sm">
                  {this.props.description}
                </p>
                <div className="py-2 flex items-center justify-center">
                  <div className="">
                    <button
                      className="
                    bg-gradient-to-r from-red-500 to-pink-500 px-3 py-2 text-gray-100 rounded tracking-wide shadow-lg mb-4 lg:mt-4"
                    >
                      Rewards - {this.props.rewards}
                    </button>
                    <span className=""></span>
                  </div>
                </div>
                <div className="">
                  <a
                    className={` bg-${this.props.color}-400 px-3 py-2 rounded text-${this.props.color}-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-${this.props.color}-300 active:bg-${this.props.color}-500 hover:-translate-y-0.5 shadow-lg`}
                    href={this.props.link}
                    target="_blank"
                    rel="noreferrer"
                  >
                    {this.props.buttonText}
                  </a>
                  {/* <DialogBox
                    title="Ready to Grab the Deal"
                    description={`Buying this deal adds ${this.props.rewards} reward points to your account, Click the button redirects you to the deal page}`}
                    buttonText="Grab Now!"
                    open={this.state.open}
                  /> */}
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
