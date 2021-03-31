import React from 'react';

const NavBar = (props) => {
return ( 
<nav className="navbar navbar-light bg-light">
  <div className="container-fluid">
    <div className="navbar-brand">Navbar
    <span className="badge rounded-pill bg-info m-2">{props.length}</span>
    </div>
  </div>
</nav>
);
}
 
export default NavBar;