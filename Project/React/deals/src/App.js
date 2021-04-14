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

class App extends Component {
  render() {
    return (
      <React.Fragment>
        <NavBar />
        <main className="container">
          <Switch>
            <Route path="/Deals" component={DealsComponent}></Route>
            <Route path="/Coupons" component={CouponsComponent}></Route>
            <Route path="/Home" component={HomeComponent}></Route>
            <Route path="/Login" component={Login}></Route>
            <Route path="/SignUp" component={RegisterComponent}></Route>
            <Route path="/not-found" component={NotFoundComponent}></Route>
            <Redirect exact from="/" to="/Home" />
            <Redirect to="/not-found" />
          </Switch>
        </main>
      </React.Fragment>
    );
  }
}

export default App;