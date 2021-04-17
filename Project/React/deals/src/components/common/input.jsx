import React from "react";

const Input = ({ name, label, value, onChange, ...rest }) => {
  return (
    <div className="mt-2">
      <label htmlFor={name} className="font-semibold">
        {label}
      </label>
      <input
        {...rest}
        name={name}
        label={label}
        id={name}
        value={value}
        onChange={onChange}
        className="form-control nm-flat-gray-200-sm border-none rounded-lg inline-block w-full mt-1 focus:nm-inset-gray-200-sm p-1"
      />
      {/* {error && <div className="alert alert-danger">error</div>} */}
    </div>
  );
};

export default Input;
