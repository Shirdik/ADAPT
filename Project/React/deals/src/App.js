import React, { Component } from "react";
import { Route, Redirect, Switch } from "react-router-dom";
import "./App.css";
import DealsComponent from "./components/dealsComponent";
import CouponsComponent from "./components/couponsComponent";
import HomeComponent from "./components/homeComponent";
import NotFoundComponent from "./components/notFoundComponent";
import NavBarComponent from "./components/navBarComponent";
import LoginComponent from "./components/loginComponent";
import RegisterComponent from "./components/registerComponent";
import FooterComponent from "./components/footerComponent";
import AdminComponent from "./components/admin/adminComponent";
import AdminDealsComponent from "./components/admin/adminDealsComponent";
import AdminCouponsComponent from "./components/admin/adminCouponsComponent";
import AdminNavBar from "./components/admin/adminNavBarComponent";
import authService from "./services/authService";
import LogoutComponent from "./components/logoutComponent";
import UserComponent from "./components/userComponent";
class App extends Component {
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
    let { user } = this.state;
    return (
      <React.Fragment>
        {user.role === "ROLE_ADMIN" ? <AdminNavBar /> : <NavBarComponent />}
        <main className="bg-gray-200">
          <Switch>
            {user.role === "ROLE_ADMIN" ? (
              <Route path="/Home" component={AdminComponent}></Route>
            ) : (
              <Route path="/Home" component={HomeComponent}></Route>
            )}
            <Route path="/Deals" component={DealsComponent}></Route>
            <Route path="/Coupons" component={CouponsComponent}></Route>
            <Route path="/Login" component={LoginComponent}></Route>
            <Route path="/Logout" component={LogoutComponent}></Route>
            <Route path="/User" component={UserComponent}></Route>
            <Route path="/SignUp" component={RegisterComponent}></Route>
            <Route path="/DealsEditor" component={AdminDealsComponent}></Route>
            <Route
              path="/CouponsEditor"
              component={AdminCouponsComponent}
            ></Route>
            <Route path="/not-found" component={NotFoundComponent}></Route>
            <Redirect exact from="/" to="/Home" />
            <Redirect to="/not-found" />
          </Switch>
        </main>
        <FooterComponent />
      </React.Fragment>
    );
  }
}

export default App;
