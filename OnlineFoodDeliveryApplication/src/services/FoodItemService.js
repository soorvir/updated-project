import axios from "axios";


class FoodItemService{

    addNewFoodItem(register){
        return axios.post("http://localhost:8080/fooditem/savefooditem",register);
    }

    getFoodById(id){
        return axios.get("http://localhost:8080/fooditem/findfooditem/"+id);
    }

    getAllFood(){
        return axios.get("http://localhost:8080/fooditem/listfooditem");
    }

}
export default new FoodItemService();