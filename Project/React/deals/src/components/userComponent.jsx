import React, { Component } from "react";
import authService from "../services/authService";

class UserComponent extends Component {
  state = {
    user: {
      username: "",
      jwt: "",
      role: "",
    },
  };
  componentDidMount() {
    let user = authService.getCurrentUser();
    if (user === null) {
      let username = "";
      let jwt = "";
      let role = "";
      this.setState({ username, jwt, role });
    } else {
      this.setState({ user });
    }
  }
  render() {
    return (
      <React.Fragment>
        <div className=" flex items-center justify-center">
          <div className="flex flex-col justify-center items-center">
            <h1 className="text-6xl display lg:py-32 py-20 text-transparent bg-clip-text bg-gradient-to-r from-red-500 to-indigo-500">
              Welcome {this.state.user.username}!
            </h1>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default UserComponent;
