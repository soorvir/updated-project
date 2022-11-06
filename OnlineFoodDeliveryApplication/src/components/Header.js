import React from 'react';
import { Link, useHistory } from 'react-router-dom';


function Header(props) {
    const history = useHistory();
    const flightuser = localStorage.getItem('user');


    const loggedIn = (

        <ul className="nav justify-content-end">
            <li className="nav-item">
                <Link className="nav-link text-info" to="/">
                    <button className="btn btn-outline-light">Home</button>
                </Link>
            </li>
            <li className="nav-item">
                <div className="dropdown">
                    <button type="button" className="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                        login
                    </button>
                    <div className="dropdown-menu">
                        
                        <a className="dropdown-item" href="/CustomerLogin">Customer</a>
                        
                        <a className="dropdown-item" href="/RestaurantLogin">Restaurant</a>
                    </div>
                </div>
                
            </li>
            <li className="nav-item">
            <div class="dropdown">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                        register
                    </button>
                    <div className="dropdown-menu">
                        <a className="dropdown-item" href="/CustomerRegister">Customer</a>
                        <a className="dropdown-item" href="/RestaurantRegister">Restaurant</a>
                    </div>
                </div>
            </li>
            <li className="nav-item">
                <Link className="nav-link text-info" to="/">
                    <button className="btn btn-outline-light">logout</button>
                </Link>
            </li>
        </ul>

    );



    const onTickets = () => {
        history.push('/tickets')
    }


    const loggedOut = (
        <ul className="nav justify-content-end">
            { }


            <li className="nav-item">
                <Link className="nav-link text-info" to="/">
                    <button className="btn btn-outline-light">Home</button>
                </Link>
            </li>


    

            <li className="nav-item">
                <Link className="nav-link text-info" to="/">
                    <button className="btn btn-outline-light">Logout</button>
                </Link>
            </li>

        </ul>
    );


    return (
        <div>
            <nav className="navbar navbar-dark bg-nav fixed-top" style={navstyle.bg}>
                <div className="container-fluid">
                    <Link style={navstyle.navbar_brand} to="/">
                        Online Food Delivery
                    </Link>


                    {localStorage.getItem('user') ? loggedOut : loggedIn}
                    { }

                </div>
            </nav>
        </div>
    );
};

let navstyle = {
    bg: {
        backgroundColor: "#0c60b6",
    },
    navbar_brand: {
        color: "#ffffff",
        fontSize: "x-large",
        fontFamily: "Verdana",
        fontStyle: "bold",
        textDecoration: "none"
    }

}

export default Header;