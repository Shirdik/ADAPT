import React from "react";
import Form from "./../common/form";
import SimpleReactValidator from "simple-react-validator";
import CouponsService from "../../services/couponsService";

class DealUpdaterComponent extends Form {
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
        CouponsService.editCoupon(this.state.data)
          .then(() => {
            alert("Coupon Updated!");
          })
          .catch((e) => console.log(e));
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
      couponCode: "",
      title: "",
      description: "",
      imageurl: "",
      link: "",
      rewards: "",
      category: "",
    },
  };
  render() {
    const { data } = this.state;
    return (
      <React.Fragment>
        <div className="flex justify-center">
          <div className="flex items-center justify-center nm-inset-gray-200 w-4/5 rounded-lg">
            <form>
              <div className="flex  flex-col items-center justify-center">
                <h1 className="text-3xl py-6">Edit Coupon</h1>
                <div className="flex flex-col space-y-3">
                  <div>
                    {this.renderInput("couponCode", "Coupon Code")}
                    {this.validator.message(
                      "Coupon Code",
                      data.couponCode,
                      "required",
                      { className: "text-red-800" }
                    )}
                  </div>
                  <div>
                    {this.renderInput("title", "Title")}
                    {this.validator.message("Title", data.title, "required", {
                      className: "text-red-800",
                    })}
                  </div>
                  <div>
                    {this.renderInput("description", "Description")}
                    {this.validator.message(
                      "Description",
                      data.description,
                      "required",
                      { className: "text-red-800" }
                    )}
                  </div>
                  <div>
                    {this.renderInput("imageurl", "Image Url")}
                    {this.validator.message(
                      "Image Url",
                      data.imageurl,
                      "required",
                      { className: "text-red-800" }
                    )}
                  </div>
                  <div>
                    {this.renderInput("link", "Link")}
                    {this.validator.message("Link", data.link, "required", {
                      className: "text-red-800",
                    })}
                  </div>
                  <div>
                    {this.renderInput("rewards", "Rewards")}
                    {this.validator.message(
                      "rewards",
                      data.rewards,
                      "required",
                      {
                        className: "text-red-800",
                      }
                    )}
                  </div>
                  <div>
                    {this.renderInput("category", "Category")}
                    {this.validator.message(
                      "category",
                      data.category,
                      "required",
                      { className: "text-red-800" }
                    )}
                  </div>
                </div>
              </div>
              <button
                className=" bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5 my-6"
                onClick={this.handleSubmit}
              >
                Update
              </button>
            </form>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default DealUpdaterComponent;
