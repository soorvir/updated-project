import axios from "axios";

class RestaurantService{

    createRestaurant(register){
        return axios.post("http://localhost:8080/restraunt/savesrestraunt",register);
    }


    getAllRestaurant(){
        return axios.get("http://localhost:8080/restraunt/listsrestraunt");
    }

    getRestaurantByName(name) {
        return axios.get("http://localhost:8080/restraunt/findrestrauntbyname/"+name);
    }
}
export default new RestaurantService();