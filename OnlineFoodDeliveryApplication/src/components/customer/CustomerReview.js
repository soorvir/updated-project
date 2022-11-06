import React, { Component } from 'react'
import './CustomerReview.css'
import CustomerReviewService from '../../services/CustomerReviewService'
import HeaderAfterLogin from '../HeaderAfterLogin'

class CustomerReview extends Component {
    constructor(props) {
        super(props);
        this.state = {
            rating: '',
            comment: ''
        }
        this.changeRating5 = this.changeRating5.bind(5);
        this.changeRating4 = this.changeRating4.bind(4);
        this.changeRating3 = this.changeRating3.bind(3);
        this.changeRating2 = this.changeRating2.bind(2);
        this.changeRating1 = this.changeRating1.bind(1);
        this.changeComment = this.changeComment.bind(this);
        this.customerReview = this.customerReview.bind(this);
    }
    changeRating1 = (event) => {
        this.setState({ rating: event.target.value })
    }
    changeRating2 = (event) => {
        this.setState({ rating: event.target.value })
    }
    changeRating3 = (event) => {
        this.setState({ rating: event.target.value })
    }
    changeRating4 = (event) => {
        this.setState({ rating: event.target.value })
    }
    changeRating5 = (event) => {
        this.setState({ rating: event.target.value })
    }

    changeComment = (event) => {
        this.setState({ comment: event.target.value })
    }
    customerReview = (e) => {
        e.preventDefault()
        let review = {
            rating: this.state.rating,
            comment: this.state.comment
        }

        console.log('review =>' + JSON.stringify(review));
        CustomerReviewService.createCustomerReview(review).then(review => {
            alert("successfully submitted")
        })
    }


    render() {


        return (
            <div className='containerReview'>
                <HeaderAfterLogin />
                <div className='contentblock'>
                    <h2>Rating</h2>
                    <div className="rate">
                        <input type="radio" id="star5" name="rate" value={this.state.changeRating5 = 5} onChange={this.changeRating5} />
                        <label htmlFor="star5" title="text">5 stars</label>
                        <input type="radio" id="star4" name="rate" value={this.state.changeRating4 = 4} onClick={this.changeRating4} />
                        <label htmlFor="star4" title="text">4 stars</label>
                        <input type="radio" id="star3" name="rate" value={this.state.changeRating3 = 3} onClick={this.changeRating3} />
                        <label htmlFor="star3" title="text">3 stars</label>
                        <input type="radio" id="star2" name="rate" value={this.state.changeRating2 = 2} onClick={this.changeRating2} />
                        <label htmlFor="star2" title="text">2 stars</label>
                        <input type="radio" id="star1" name="rate" value={this.state.changeRating1 = 1} onClick={this.changeRating1} />
                        <label htmlFor="star1" title="text">1 star</label>
                    </div>
                    <br></br>
                    <h3>Comment</h3>
                    <div><input type="text" name="Comment" value={this.state.comment} onChange={this.changeComment} /></div><br></br>

                    <button onClick={this.customerReview}>Submit</button>
                </div>
            </div>
        )

    }

}
export default CustomerReview;