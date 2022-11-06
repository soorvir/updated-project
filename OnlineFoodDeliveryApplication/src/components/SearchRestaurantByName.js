import React, { Component } from 'react';
import RestaurantService from '../services/RestaurantService';

class SearchRestaurantByName extends Component {
    constructor(props){
        super(props);
        this.state = {
            Owner: [],
            own: '',
            restrauntName:'',
            rest:[]
        }
        
         this.changeRestrauntName=this.changeRestrauntName.bind(this);
        // this.changeOwnerPassword=this.changeOwnerPassword.bind(this);
        // this.validateOwner=this.validateOwner.bind(this);
    }

    changeRestrauntName= (event) => {
        this.setState({ restrauntName: event.target.value })
    }

   


    // validateOwner= (e) => {
    //     e.preventDefault()
    //     let find=0;
    //     for (let i = 0; i < this.state.own.length; i++){
    //         if ((this.state.username === this.state.own[i].username) && (this.state.password === this.state.own[i].password)){
    //             alert(" welcome " + this.state.own[i].ownerFirstName + " " + this.state.own[i].ownerLastName);
    //             find=1;
    //             this.setState({restruantId:this.state.own[i].restruantId});
    //             console.log(this.state.restruantId);
    //             localStorage.setItem("restruantId",this.state.own[i].restruantId);
    //             this.props.history.push("/AddFoodItem");
    //         }
    //     }
    //     if(find===0){
    //         alert("Invalid Username or Password");
    //     }
    // }

    componentDidMount(){
        let Owner= { restrauntName: this.state.restrauntName }
        console.log(this.state.restrauntName)
        console.log('Owner =>' + JSON.stringify(Owner));
        RestaurantService.getAllRestaurant().then((res) => {
            this.setState({ Owner: res.data })
            // this.state.own = (res.data);
            console.log(this.state.Owner);
        })
    }

    getRestaurantByName = () => {
        this.setState({
            searched: false
        });
        let rest=RestaurantService.getRestaurantByName(this.state.restrauntName).then((res) => {
                this.setState({ rest: res.data })
                console.log(this.state.rest);
                localStorage.setItem("getRestaurantByName", JSON.stringify(this.state.rest));
        });
    }
        // let Owner= { restrauntName: this.state.restrauntName }
        // console.log(this.state.restrauntName)
        // console.log('Owner =>' + JSON.stringify(Owner));
        // RestaurantService.getRestaurantByName().then((res) => {
        //     this.setState({ Owner: res.data })
        //     this.state.own = (res.data);
        //     console.log(this.state.own);
        // })
        // RestaurantService.getRestaurantByName(this.props.restrauntName).then(data => {
        //     console.log("inside function");
        //     if(data.length>0){
        //         this.setState({
        //             restaurant : data,
        //             searched : true
                    
        //         });
        //         console.log("inside if");
                
        //     }
        //     else{
        //         alert('No Flights Found!!')
        // }
            
        

    render() {
        return (
            <div className="container-fluid p-4 m-3">
                <h2 style={styling.heading}>Search By Restaurant</h2>
                <div className="form-inline">
                    <div className="input-group mb-2 mr-sm-2">
                       
                        <input type = "text" className="custom-select my-1 mr-sm-2" id="restaurantName" name="restaurantName" value={this.state.restrauntName} onChange={this.changeRestrauntName} required/>
                    </div>       
                        
                    <button onClick={this.getRestaurantByName} className="btn mb-2 mr-sm-2" style={styling.icon}>
                    search</button>
                </div>
 
                {/* {this.state.searched && <FlightList flights={this.state.flights}  />} */}
               {localStorage.getItem("getRestaurantByName")}
            </div>
        );
    }
}

let styling = {
    heading : {
        color : "#333333",
        fontFamily : "Verdana",
        marginBottom : 20
    },
    icon : {
       
    }
}

export default SearchRestaurantByName;







   