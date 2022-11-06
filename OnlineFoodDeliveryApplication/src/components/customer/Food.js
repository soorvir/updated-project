import React, { Component } from 'react'
import {Link,withRouter} from 'react-router-dom'
import './Food.css'
import { FaShoppingCart } from "react-icons/fa";
import { FaCartPlus } from "react-icons/fa";
import Cart from './Cart'



class Food extends Component{
    constructor(props){
        super(props);
        
        
       
        this.moveToCart=this.moveToCart.bind(this);
    }
   

    moveToCart=(e)=>{
        
        console.log(this.props.wholeDetail);
        const OrderedList = this.props.dif
        localStorage.setItem("OrderedList", JSON.stringify(OrderedList));
        // return <Cart non={this.props.wholeDetail}/>
        // e.preventDefault();
        // <Cart/>
        
    }

    
   

    render(){
    return (
        <div >
            <div className='firstline' style={{ marginRight: '20px',marginLeft:'20px' }}>
                <div className="product-card">
                    <div className="product-tumb">
                        <img src="https://cdn-icons-png.flaticon.com/512/1674/1674395.png" alt="" />
                    </div>
                    <div className="product-details">
                        
                        <span className="product-catagory">{this.props.name}</span>
                        <span>{this.props.type}</span>(<span>{this.props.category}</span>)
                        <div className="product-bottom-details">
                            <div className="product-price"><small></small>₹  {this.props.price}/-
                            </div>
                            <button className='addedbutton' onClick={this.moveToCart}>Add to cart</button>
                            {/* <FaShoppingCart onClick={this.add}/>
                            <FaCartPlus/> */}
                        </div>

                    </div>

                </div>
            </div>
        </div>
    )
}

}
export default withRouter(Food) ;
