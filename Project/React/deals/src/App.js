import React, { Component } from "react";
import { Route, Redirect, Switch } from "react-router-dom";
import "./App.css";
import DealsComponent from "./components/dealsComponent";
import CouponsComponent from "./components/couponsComponent";
import HomeComponent from "./components/homeComponent";
import NotFoundComponent from "./components/notFoundComponent";
import NavBar from "./components/navBarComponent";
import Login from "./components/loginComponent";
import RegisterComponent from "./components/registerComponent";
import FooterComponent from "./components/footerComponent";
import AdminComponent from "./components/admin/adminComponent";
import AdminDealsComponent from "./components/admin/adminDealsComponent";
import AdminCouponsComponent from "./components/admin/adminCouponsComponent";
// import AdminNavBar from "./components/admin/adminNavBarComponent";

class App extends Component {
  render() {
    return (
      <React.Fragment>
        <NavBar />
        <main className="bg-gray-200">
          <Switch>
            <Route path="/Deals" component={DealsComponent}></Route>
            <Route path="/Coupons" component={CouponsComponent}></Route>
            <Route path="/Home" component={HomeComponent}></Route>
            <Route path="/Login" component={Login}></Route>
            <Route path="/SignUp" component={RegisterComponent}></Route>
            <Route path="/admin" component={AdminComponent}></Route>
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
