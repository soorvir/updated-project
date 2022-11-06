import React, { Component } from 'react'
import './RestaurantRegister.css'
import RestaurantService from '../../services/RestaurantService'


class RestaurantRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      ownerFirstName: '',
      ownerMiddleName: '',
      ownerLastName: '',
      restrauntPhoneNumber: '',
      restrauntEmail: '',
      restrauntStreet: '',
      restrauntCity: '',
      restrauntCountry: '',
      restrauntName: '',
      username: '',
      password: ''
    }
    this.changeOwnerFirstName = this.changeOwnerFirstName.bind(this);
    this.changeOwnerMiddleName = this.changeOwnerMiddleName.bind(this);
    this.changeOwnerLastName = this.changeOwnerLastName.bind(this);
    this.changeOwnerEmail = this.changeOwnerEmail.bind(this);
    this.changeOwnerPhoneNumber = this.changeOwnerPhoneNumber.bind(this);
    this.changeRestrauntStreet = this.changeRestrauntStreet.bind(this);
    this.changeRestrauntCity = this.changeRestrauntCity.bind(this);
    this.changeRestrauntCountry = this.changeRestrauntCountry.bind(this);
    this.changeRestrauntName = this.changeRestrauntName.bind(this);
    this.changeOwnerUsername = this.changeOwnerUsername.bind(this);
    this.changeOwnerPassword = this.changeOwnerPassword.bind(this);
    this.registerRestaurant = this.registerRestaurant.bind(this);
  }

  changeOwnerFirstName = (event) => {
    this.setState({ ownerFirstName: event.target.value })
  }

  changeOwnerMiddleName = (event) => {
    this.setState({ ownerMiddleName: event.target.value })
  }

  changeOwnerLastName = (event) => {
    this.setState({ ownerLastName: event.target.value })
  }

  changeOwnerEmail = (event) => {
    this.setState({ restrauntEmail: event.target.value })
  }

  changeOwnerPhoneNumber = (event) => {
    this.setState({ restrauntPhoneNumber: event.target.value })
  }

  changeRestrauntStreet = (event) => {
    this.setState({ restrauntStreet: event.target.value })
  }

  changeRestrauntCity = (event) => {
    this.setState({ restrauntCity: event.target.value })
  }

  changeRestrauntCountry = (event) => {
    this.setState({ restrauntCountry: event.target.value })
  }

  changeRestrauntName = (event) => {
    this.setState({ restrauntName: event.target.value })
  }

  changeOwnerUsername = (event) => {
    this.setState({ username: event.target.value })
  }

  changeOwnerPassword = (event) => {
    this.setState({ password: event.target.value })
  }

  registerRestaurant = (e) => {
    e.preventDefault()
    let register = {
      ownerFirstName: this.state.ownerFirstName,
      ownerMiddleName: this.state.ownerMiddleName,
      ownerLastName: this.state.ownerLastName,
      restrauntPhoneNumber: this.state.restrauntPhoneNumber,
      restrauntEmail: this.state.restrauntEmail,
      restrauntStreet: this.state.restrauntStreet,
      restrauntCity: this.state.restrauntCity,
      restrauntCountry: this.state.restrauntCountry,
      restrauntName: this.state.restrauntName,
      username: this.state.username,
      password: this.state.password
    }

    console.log('register =>' + JSON.stringify(register));
    RestaurantService.createRestaurant(register).then(res => {
      alert("You registered successfully")
      this.props.history.push("/RestaurantLogin");

    })
  }
  render() {
    return (
      <div className='wholeBody7'>
        <div className="container7" id="container7">
          <div className="form-container7 sign-up-container7">
            <form action="#">
              <h1>Create Restaurant Account</h1>

              <div className="names" style={{marginTop:'20px'}}>
                <input type="text" placeholder="First name" style={{ width: '25%' }} name="ownerFirstName" value={this.state.ownerFirstName} onChange={this.changeOwnerFirstName} />
                <input type="text" placeholder="Middle name" style={{ width: '20%', margin: ' 0 12px' }} name="ownerMiddleName" value={this.state.ownerMiddleName} onChange={this.changeOwnerMiddleName} />
                <input type="text" placeholder="Last name" style={{ width: '25%' }} name="ownerLastName" value={this.state.ownerLastName} onChange={this.changeOwnerLastName} />
              </div>
              <div className="try">
                <input type="email" placeholder="Email" style={{ width: '35%' }} name="restrauntEmail" value={this.state.restrauntEmail} onChange={this.changeOwnerEmail} />
                <input type="number" placeholder="phone number" style={{ width: '35%', marginLeft: '20px', marginBottom: '10px' }} name="restrauntPhoneNumber" value={this.state.restrauntPhoneNumber} onChange={this.changeOwnerPhoneNumber} />
              </div>
              <h3 style={{ margin: '0' }}>Address:</h3>
              <div className="names" style={{ marginTop: '10px' }}>
                <input type="text" placeholder="Street name" style={{ width: '25%' }} name="restrauntStreet" value={this.state.restrauntStreet} onChange={this.changeRestrauntStreet} />
                <input type="text" placeholder="City name" style={{ width: '20%', margin: ' 0 12px' }} name="restrauntCity" value={this.state.restrauntCity} onChange={this.changeRestrauntCity} />
                <input type="text" placeholder="Country name" style={{ width: '25%' }} name="restrauntCountry" value={this.state.restrauntCountry} onChange={this.changeRestrauntCountry} />
              </div>
              <h3 style={{ margin: '0' }}>Login Credentials:</h3>
              <div className="names" style={{ marginTop: '10px', marginBottom: '20px' }}>
                <input type="text" placeholder="Restaurant name" style={{ width: '25%' }} name="restrauntName" value={this.state.restrauntName} onChange={this.changeRestrauntName} />
                <input type="text" placeholder="Username" style={{ width: '20%', margin: ' 0 12px' }} name="username" value={this.state.username} onChange={this.changeOwnerUsername} />
                <input type="text" placeholder="Password" style={{ width: '25%' }} name="password" value={this.state.password} onChange={this.changeOwnerPassword} />
              </div>
              <button onClick={this.registerRestaurant}>Sign Up</button>
            </form>
          </div>
        </div>
      </div>
    )
  }

}
export default RestaurantRegister;