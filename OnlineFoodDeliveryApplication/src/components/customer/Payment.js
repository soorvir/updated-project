import React, { Component } from 'react'
import './Payment.css'
import PaymentService from '../../services/PaymentService'
import HeaderAfterLogin from '../HeaderAfterLogin'

class Payment extends Component {
    constructor(props) {
        super(props);
        this.state = {
            total: localStorage.getItem("Totalamount"),
            cvvNumber: 0,
            cardNumber: 0,
            amount:localStorage.getItem("TotalAmount")
        }
        this.changecvvNumber = this.changecvvNumber.bind(this);
        this.changecardNumber = this.changecardNumber.bind(this);
        this.changeamount = this.changeamount.bind(this);
        this.payment = this.payment.bind(this);
    }
    changecvvNumber = (event) => {
        this.setState({ cvvNumber: event.target.value })
        
    }
    changecardNumber = (event) => {
        this.setState({ cardNumber: event.target.value })
    }
    changeamount = (event) => {
        this.setState({ amount: event.target.value })
    }
    payment = (e) => {
        e.preventDefault()
        let paymentOrder = {
            cvvNumber: this.state.cvvNumber,
            cardNumber: this.state.cardNumber,
            amount: this.state.amount
        }

        console.log('paymentOrder =>' + JSON.stringify(paymentOrder));
        PaymentService.createPayment(paymentOrder).then(paymentOrder => {
            alert("payment successfully completed")
            this.props.history.push("/CustomerReview");
        })

    }


    render() {

        let a;
        return (
            <div>
                <HeaderAfterLogin />
            <div className="centerMiddle">
                
                <div className="containerpayment">
                    <div className="center">
                        <br></br>
                        <h2>PAYMENT</h2>
                        <form>
                            <h3>Card number</h3>
                            <input type="text" name="" placeholder="Enter card number" value={this.state.cardNumber} onChange={this.changecardNumber} />
                            <h3>Exp month</h3>
                            <input type="text" name="" placeholder="Enter Month" />
                            <div id="zip">
                                <label>
                                    <h3>Exp year</h3>
                                    <select>
                                        <option>Choose Year..</option>
                                        <option>2022</option>
                                        <option>2023</option>
                                        <option>2024</option>
                                        <option>2025</option>
                                        <option>2026</option>
                                        <option>2027</option>
                                        <option>2028</option>
                                        <option>2029</option>
                                        <option>2030</option>
                                        <option>2031</option>
                                        <option>2032</option>
                                        <option>2033</option>
                                    </select>
                                </label>
                                <label>
                                    <h3>CVV</h3>
                                    <input type="number" name="cvvnumber" placeholder="CVV" value={this.state.cvvNumber} onChange={this.changecvvNumber} />
                                </label>
                            </div>
                            <div className="right">
                                <h2>Total:{this.state.amount}</h2>
                                </div>
                        </form>
                        <button onClick={this.payment}>Proceed to Checkout</button>
                    </div>
                </div>
            </div>
            </div>

        )

    }

}
export default Payment;