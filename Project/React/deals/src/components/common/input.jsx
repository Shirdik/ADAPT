import React from "react";

const Input = ({ name, label, value, onChange, ...rest }) => {
  return (
    <div className="mt-2">
      <label htmlFor={name} className="">
        {label}
      </label>
      <input
        {...rest}
        name={name}
        label={label}
        id={name}
        value={value}
        onChange={onChange}
        className="bg-gray-200 rounded-lg inline-block w-full mt-1"
      />
      {/* {error && <div className="alert alert-danger">error</div>} */}
    </div>
  );
};

export default Input;
