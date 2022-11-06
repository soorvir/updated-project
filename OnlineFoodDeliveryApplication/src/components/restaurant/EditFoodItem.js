import React, { Component } from 'react'
import './FoodOfRestaurant.css'

import FoodItemService from '../../services/FoodItemService'
import Food from '../customer/Food'
import HeaderAfterLoginR from '../HeaderAfterLoginR'
import FoodOfRestaurant from './FoodOfRestaurant'


class FoodItem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            foods: []
        }
        console.log("from constructor");
        
         this.addingTry = this.addingTry.bind(this);
    }
    

    componentDidMount() {
        FoodItemService.getAllFood().then((res) => {
            this.setState({ foods: res.data })
            console.log(this.state.foods);


        })
        console.log(this.state.foods);

    }

    addingTry = (e) => {
        this.props.history.push("/addfooditem");
    }



    render() {
        // console.log("from render");
        // const foodList = this.state.foods
        // localStorage.setItem("foodList", JSON.stringify(foodList));
        
        return (

            <div className='wholebodyFoodItem'>
            <HeaderAfterLoginR />
                <h1>Food Items</h1>
                <div style={{margin:'50px'}}>
                    <div className='now' style={{ display: 'flex',flexWrap: 'wrap'}}>
                        {
                            this.state.foods.map(food => {
                                return <FoodOfRestaurant key={food.foodItemId} dif={food.foodItemId} wholeDetail={food} name={food.foodItemName} price={food.foodItemPrice} type={food.foodItemType} category={food.foodItemCategory}/>
                            })
                        }
                    </div>
                </div>
                <button onClick={this.addingTry}>Add new Food</button>
            </div>
        )

    }

}
export default FoodItem;