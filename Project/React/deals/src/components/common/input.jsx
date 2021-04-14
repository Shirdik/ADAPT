import React from "react";

const Input = ({ name, label, value, onChange, ...rest }) => {
  return (
    <div className="form-group">
      <label htmlFor={name}>{label}</label>
      <input
        {...rest}
        name={name}
        label={label}
        id={name}
        value={value}
        onChange={onChange}
        className="form-control"
      />
      {/* {error && <div className="alert alert-danger">error</div>} */}
    </div>
  );
};

export default Input;
