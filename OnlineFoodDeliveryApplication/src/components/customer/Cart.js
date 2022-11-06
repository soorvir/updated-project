
import React, { Component } from 'react'
import FoodItemService from '../../services/FoodItemService';
import OrderService from '../../services/OrderService';
import './Cart.css';
import './Payment.css';
import HeaderAfterLogin from '../HeaderAfterLogin'


export default class Cart extends Component {
    constructor(props) {
        super(props);
        this.state = {
            // empId : this.props.match.params.id,
            foodItem: [{}],
            quantity: '',
            customerId: localStorage.getItem("customerId"),
            foodPrice: '',
            orderEntity: {
                productQuantity: '',
                productPrice: '',
                orderStatus: ''
            },
            calulateTotal: ''
        }
        this.changeOrderQuantity = this.changeOrderQuantity.bind(this);
        this.OrderNow = this.OrderNow.bind(this);
    }

    changeOrderQuantity = (event) => {
        this.setState({ quantity: event.target.value });
        this.setState({ calulateTotal: this.state.quantity });
        this.setState({ foodPrice: this.state.calulateTotal });
        this.setState({ orderEntity: { productQuantity: this.state.quantity, productPrice: this.state.foodPrice, orderStatus: "success" } });
    }

    OrderNow = (e) => {
        e.preventDefault();
        let myOrderBe = {

            "customerId":this.state.customerId,
            "quantity": this.state.quantity,
            "foodPrice":this.state.quantity*this.state.foodItem.foodItemPrice,
            "foodItem": [
                {
                    "foodItemName": this.state.foodItem.foodItemName,
                    "foodItemType": this.state.foodItem.foodItemType,
                    "foodItemCategory": this.state.foodItem.foodItemCategory,
                    "foodItemPrice": this.state.foodItem.foodItemPrice,
                    "restruantId": this.state.foodItem.restruantId
                }
            ],
            "orderEntity": {
                "productQuantity":this.state.quantity,
                "productPrice":this.state.quantity*this.state.foodItem.foodItemPrice,
                "orderStatus": "success",
                "foodOrderId": this.state.foodItem.foodOrderId
            }

        }
        console.log('myOrderBe =>' + JSON.stringify(myOrderBe));
        OrderService.postNewOrder(myOrderBe).then(res => {
            alert("Your Order placed Successfully");

        })
        localStorage.setItem("TotalAmount", JSON.stringify(this.state.quantity*this.state.foodItem.foodItemPrice));
        this.props.history.push(`/payment`);
    }

    componentDidMount() {
        FoodItemService.getFoodById(localStorage.getItem("OrderedList")).then((response) => {
            this.setState({ foodItem: response.data })
        })

        console.log(this.state.foodItem);
    }

    render() {

        return (
            <div>
                <HeaderAfterLogin />
                <div className='wholeBodyCart'>
                    <div className="containerCart" id="containerCart">
                        <div className="form-containerCart sign-in-containerCart">
                            <form >
                                <h1 className='h1cart' style={{ color: 'red' }}>Cart</h1>
                                <h2>Food Name:{this.state.foodItem.foodItemName}</h2>
                                <h2>Food Type:{this.state.foodItem.foodItemType}</h2>
                                <h2>Food category:{this.state.foodItem.foodItemCategory}</h2>
                                <h2>Food Price:{this.state.foodItem.foodItemPrice}</h2>
                                <div style={{ display: 'flex', marginLeft: '120px' }}>
                                    <h2>Quantity:</h2><input type="text" placeholder="Quantity" style={{ marginLeft: '10px', width: '10%' }} name="quantity" value={this.state.quantity} onChange={this.changeOrderQuantity} />
                                </div>
                                

                                <button onClick={this.OrderNow}>Order</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        )
    }

}
// Footer
// © 2022 GitHub, Inc.
// Footer navigation
// Terms
// Privacy
// Security
// Status
// Docs
// Contact GitHub
// Pricing
// API
// Training
// Blog
// About
