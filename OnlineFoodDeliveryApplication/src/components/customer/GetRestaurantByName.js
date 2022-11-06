import React, { Component } from 'react'
import './FoodItem.css'

import RestaurantService from '../../services/RestaurantService'
import Food from './Food'


class FoodItem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            foods: []
        }
        console.log("from constructor");
        
        // this.addingTry = this.addingTry.bind(this);
        this.visitToCart=this.visitToCart.bind(this);
    }
    

    componentDidMount() {
        RestaurantService.getRestaurantByName().then((res) => {
            this.setState({ foods: res.data })
            console.log(this.state.foods);


        })
        console.log(this.state.foods);

    }

    // addingTry = (e) => {
    //     this.props.history.push("/addfooditem");
    // }

    visitToCart =(e)=>{
        this.props.history.push("/cart");
    }



    render() {
        // console.log("from render");
        // const foodList = this.state.foods
        // localStorage.setItem("foodList", JSON.stringify(foodList));
        
        return (

            <div className='wholebodyFoodItem'>
                <h1>Food Items</h1>
                <div style={{margin:'50px'}}>
                    <div className='now' style={{ display: 'flex',flexWrap: 'wrap'}}>
                        {
                            this.state.foods.map(food => {
                                return <Food key={food.foodItemId} dif={food.foodItemId} wholeDetail={food} name={food.foodItemName} price={food.foodItemPrice} type={food.foodItemType} category={food.foodItemCategory}/>
                            })
                        }
                    </div>
                </div>
                {/* <button onClick={this.addingTry}>Add new Food</button> */}

                <button style={{marginLeft:'30px'}}onClick={this.visitToCart}>Go to cart</button>
            </div>
        )

    }

}
export default FoodItem;