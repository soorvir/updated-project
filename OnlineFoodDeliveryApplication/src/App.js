import { Route, Switch } from 'react-router';
import Home from './components/Home';
import Payment from './components/customer/Payment';
import ErrorWorld from './components/ErrorWorld';
import CustomerLogin from './components/customer/CustomerLogin';
import CustomerRegister from './components/customer/CustomerRegister';
import RestaurantLogin from './components/restaurant/RestaurantLogin';
import RestaurantRegister from './components/restaurant/RestaurantRegister';
import FoodItem from './components/customer/FoodItem';
import Food from './components/customer/Food';
import Cart from './components/customer/Cart';
import EditFoodItem from './components/restaurant/EditFoodItem';
import AddFoodItem from './components/restaurant/AddFoodItem';
import CustomerReview from './components/customer/CustomerReview';
import SearchRestaurantByName from './components/SearchRestaurantByName';

function App() {
  return (
    <main>
      <Switch>
        <Route path="/" component={Home} exact />
        <Route path="/payment" component={Payment} />
        <Route path="/CustomerLogin" component={CustomerLogin} />
        <Route path="/CustomerRegister" component={CustomerRegister} />
        <Route path="/RestaurantRegister" component={RestaurantRegister} />
        <Route path="/RestaurantLogin" component={RestaurantLogin} />
        <Route path="/FoodItem" component={FoodItem} />
        <Route path="/Food" component={Food} />
        <Route path="/Cart" component={Cart} />
        <Route path="/EditFoodItem" component={EditFoodItem} />
        <Route path="/AddFoodItem" component={AddFoodItem} />
        <Route path="/CustomerReview" component={CustomerReview} />
        <Route path="/SearchRestaurantByName" component={SearchRestaurantByName} exact />
        
        <Route component={ErrorWorld} />
        
      </Switch>
    </main>
  );
}

export default App;
