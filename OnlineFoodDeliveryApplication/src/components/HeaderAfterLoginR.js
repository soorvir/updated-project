import React from 'react';
import { Link, useHistory } from 'react-router-dom';
import FoodItem from './customer/FoodItem';
import Cart from './customer/Cart';

function HeaderAfterLoginR(props) {
    const history = useHistory();
    const flightuser = localStorage.getItem('user');


    const loggedIn = (

        <ul className="nav justify-content-end">
            <li className="nav-item">
                <Link className="nav-link text-info" to="/EditFoodItem">
                    <button className="btn btn-outline-light">Home</button>
                </Link>
            </li>

            <li className="nav-item">
                <div class="dropdown">

                </div>
            </li>
            <li className="nav-item">
                <Link className="nav-link text-info" to="/">
                    <button className="btn btn-outline-light">logout</button>
                </Link>
            </li>
        </ul>

    );






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

export default HeaderAfterLoginR;