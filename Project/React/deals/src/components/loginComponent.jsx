// import React from "react";
// import Joi from "joi-browser";
// import htmlForm from "./common/htmlForm";

// className Login extends htmlForm {
//   // Submit Event
//   handleSubmit = (e) => {
//     e.preventDefault();

//     // const errors = this.validate();
//     // this.setState({ errors: errors || {} });
//     // if (errors) return;

//     console.log("Submitted");
//   };

//   // Schema
//   schema = {
//     username: Joi.string().required().label("Username"),
//     password: Joi.string().required().label("Password"),
//   };

//   state = {
//     data: {
//       username: "",
//       password: "",
//     },
//     errors: {
//       error: "",
//     },
//   };
//   render() {
//     return (
//       <div classNameName="container">
//         <h1 classNameName="display-4">Login</h1>
//         <htmlForm onSubmit={this.handleSubmit}>
//           {this.renderInput("username", "Username")}
//           {this.renderInput("password", "Password", "password")}
//           {this.renderButton("Login")}
//         </htmlForm>
//       </div>
//     );
//   }
// }

// export default Login;

import React, { Component } from "react";

class Login extends Component {
  render() {
    return (
      <div>
        <form>
          <div className="mb-3">
            <label htmlFor="Username" className="htmlForm-label">
              Username
            </label>
            <input type="text" className="htmlForm-control" id="Username" />
            <div id="emailHelp" className="htmlForm-text">
              We'll never share your details with anyone else.
            </div>
          </div>
          <div className="mb-3">
            <label htmlFor="Password" className="htmlForm-label">
              Password
            </label>
            <input type="password" className="htmlForm-control" id="Password" />
          </div>
          <button type="submit" className="btn btn-primary">
            Submit
          </button>
        </form>
      </div>
    );
  }
}

export default Login;
