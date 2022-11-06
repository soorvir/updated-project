import axios from "axios";


class PaymentService {

    createPayment(paymentOrder){
        return axios.post("http://localhost:8080/payment/savepayment",paymentOrder);
    }

}
export default new PaymentService();