import React from "react";
import couponsService from "../../services/couponsService";
import Form from "../common/form";

class RemoveCouponComponent extends Form {
  handleButton = () => {
    couponsService
      .removeCoupon(this.state.data.couponCode)
      .then(() => {
        alert("Deleted Successfully!");
        window.location.reload();
      })
      .catch((e) => {
        console.log(e);
        alert("Something Went Wrong");
      });
  };
  handleChange = ({ target }) => {
    const { data } = { ...this.state };
    data[target.name] = target.value;
    this.setState({ data });
  };
  state = {
    data: {
      couponCode: "",
    },
  };
  render() {
    return (
      <React.Fragment>
        <div className="flex justify-center w-full">
          <div className="nm-inset-gray-200 rounded-md flex items-center justify-center w-4/5 md:w-1/2">
            <div className="flex flex-col items-center justify-center">
              <h1 className="text-3xl py-6">Delete Coupon</h1>
              <div className="">
                {this.renderInput("couponCode", "Coupon Code")}
                <div
                  className=" bg-red-500 px-3 py-2 rounded text-red-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-red-500 active:bg-red-700 hover:-translate-y-0.5 my-6 cursor-pointer"
                  onClick={this.handleButton}
                >
                  Delete
                </div>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default RemoveCouponComponent;
