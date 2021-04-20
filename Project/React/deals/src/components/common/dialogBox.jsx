// import { useState } from "react";
// import { Dialog } from "@headlessui/react";

// function DialogBox(props) {
//   let [isOpen, setIsOpen] = useState(true);

//   return (
//     <Dialog open={isOpen} onClose={() => setIsOpen(true)}>
//       <Dialog.Overlay />

//       <Dialog.Title>{props.title}</Dialog.Title>
//       <Dialog.Description>{props.description} </Dialog.Description>

//       {/* <p>
//         Are you sure you want to deactivate your account? All of your data will
//         be permanently removed. This action cannot be undone.
//       </p> */}

//       <a
//         href={props.link}
//         target="_blank"
//         rel="noreferrer"
//         onClick={() => setIsOpen(false)}
//         autoFocus
//       >
//         {props.buttonText}
//       </a>
//       {/* <button onClick={() => setIsOpen(false)}>Cancel</button> */}
//     </Dialog>
//   );
// }
// export default DialogBox;
