// import React, { Component } from "react";
// // import Form from "./../common/form";
// import { axios } from "axios";
// import ItemForm from "./../common/itemForm";
// class DealAdderComponent extends Component {
//   handleChange = ({ target }) => {
//     const { data } = { ...this.state };
//     data[target.name] = target.value;
//     this.setState({ data });
//   };

//   handleSubmit = async () => {
//     axios.post("http://localhost:8081/admin/addDeal", this.state.data);
//   };
//   state = {
//     data: {
//       dealCode: "",
//       title: "",
//       description: "",
//       imageurl: "",
//       link: "",
//       rewards: "",
//       category: "",
//     },
//   };
//   render() {
//     return (
//       <React.Fragment>
//         <ItemForm code="dealCode" name="Deal Code" />
//         {/* <div className="">
//           <form>
//             <div className="flex  flex-col items-center justify-center nm-inset-gray-200 w-4/5">
//               <div className="text-3xl">Add Deal</div>
//               <div className="">
//                 { {this.renderInput(`${this.props.code}`, `${this.props.name}`)} }
//                 {this.renderInput("dealCode", "Deal Code")}
//                 {this.renderInput("title", "Title")}
//                 {this.renderInput("description", "Description")}
//                 {this.renderInput("imageurl", "Image Url")}
//                 {this.renderInput("link", "Link")}
//                 {this.renderInput("rewards", "Rewards")}
//                 {this.renderInput("category", "Category")}
//               </div>
//             </div>
//             <div
//               className=" bg-blue-400 px-3 py-2 rounded text-blue-900 inline-block uppercase text-sm tracking-wider font-semibold transition transform duration-300 hover:bg-blue-300 active:bg-blue-500 hover:-translate-y-0.5"
//               onClick={this.handleSubmit}
//             >
//               Submit
//             </div>
//           </form>
//     </div>*/}
//       </React.Fragment>
//     );
//   }
// }

// export default DealAdderComponent;
