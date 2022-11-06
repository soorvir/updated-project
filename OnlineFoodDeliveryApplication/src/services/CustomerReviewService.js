import axios from "axios";


class CustomerReviewService {

    createCustomerReview(review){
        return axios.post("http://localhost:8080/feedback/savefeedback",review);
    }

}
export default new CustomerReviewService();