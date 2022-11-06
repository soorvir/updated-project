import React, { Component } from 'react'
import './AddFoodItem.css'
import FoodItemService from '../../services/FoodItemService'

class AddFoodItem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            foodItemName: '',
            foodItemType: '',
            foodItemPrice: '',
            foodItemCategory: ''
            

        }
        this.changeFoodItemName = this.changeFoodItemName.bind(this);
        this.changeFoodItemType = this.changeFoodItemType.bind(this);
        this.changeFoodItemCategory = this.changeFoodItemCategory.bind(this);
        this.changeFoodItemPrice = this.changeFoodItemPrice.bind(this);
        this.addingFoodItem = this.addingFoodItem.bind(this);
    }

    changeFoodItemName = (event) => {
        this.setState({ foodItemName: event.target.value })
    }

    changeFoodItemType = (event) => {
        this.setState({ foodItemType: event.target.value })
    }

    changeFoodItemCategory = (event) => {
        this.setState({ foodItemCategory: event.target.value })
    }

    changeFoodItemPrice = (event) => {
        this.setState({ foodItemPrice: event.target.value })
    }

    addingFoodItem = (e) => {
        e.preventDefault();
        let register = {
            foodItemName: this.state.foodItemName,
            foodItemType: this.state.foodItemType,
            foodItemCategory: this.state.foodItemCategory,
            foodItemPrice: this.state.foodItemPrice,
            restruantId:localStorage.getItem("restruantId")
        }
        console.log('register =>' + JSON.stringify(register));
        FoodItemService.addNewFoodItem(register).then(res => {
            alert("Food Item added successfully");
            this.props.history.push("/EditFoodItem");
        })
    }

    render() {
        return (
            <div>
                <div className='wholeBodyaddfood'>
                    <div className="containeraddfood" id="containeraddfood">
                        <div className="form-containeraddfood sign-up-containeraddfood">
                            <form action="#">
                                <h1>Add Food Items</h1>
                                <div style={{ marginTop: '20px',marginBottom:'20px' }}>
                                    <input type="text" placeholder="Food name"style={{ width: '55%' }} name="foodItemName" value={this.state.foodItemName} onChange={this.changeFoodItemName} />
                                    <input type="text" placeholder="Food type(veg/non-veg)"style={{ width: '55%' }} name="foodItemType" value={this.state.foodItemType} onChange={this.changeFoodItemType} />
                                    <input type="text" placeholder="Food Category(Indian/Chinees)" style={{ width: '55%' }}name="foodItemCategory" value={this.state.foodItemCategory} onChange={this.changeFoodItemCategory} />
                                    <input type="number" placeholder="Food price" name="foodItemPrice"style={{ width: '55%' }} value={this.state.foodItemPrice} onChange={this.changeFoodItemPrice} />
                                </div>
                                <button onClick={this.addingFoodItem}>Add</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        )
    }

}
export default AddFoodItem;