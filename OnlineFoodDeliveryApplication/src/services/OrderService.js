import axios from "axios";


class OrderService{
    postNewOrder(myOrderBe){
        return axios.post("http://localhost:8080/foodorder/savefoodorder",myOrderBe);
    }
}
export default new OrderService();