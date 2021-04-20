import { Component } from "react";

class UserDetailsService extends Component {
  state = {
    username: "",
    jwt: "",
    role: "",
  };

  getUserDetails = () => {
    return this.state;
  };
  setUserDetails = (username, jwt, role) => {
    this.setState({ username, jwt, role });
  };

  logoutUser = () => {
    const username = "";
    const jwt = "";
    const role = "";
    this.setState({ username, jwt, role });
  };

  getToken = () => {
    let { jwt } = this.state;
    return `Bearer ${jwt}`;
  };

  getHeader = () => {
    return `{headers:{Authorization : ${this.getToken}}}`;
  };

  render() {
    return <div className="hidden">UserDetailsService</div>;
  }
}

export default new UserDetailsService();
