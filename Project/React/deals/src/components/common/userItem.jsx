import React from "react";
const UserItem = (props) => {
  return (
    <React.Fragment>
      <div className="flex">
        <div className="flex nm-flat-gray-200 rounded-lg w-full p-2  justify-between ">
          <div className="text-semibold">{props.title}</div>
          <div className={`text-${props.color}-600`}>
            {props.sign}
            {props.rewards}
          </div>
        </div>
      </div>
    </React.Fragment>
  );
};

export default UserItem;
