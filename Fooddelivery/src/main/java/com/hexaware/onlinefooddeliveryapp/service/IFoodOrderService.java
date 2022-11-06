package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.hexaware.onlinefooddeliveryapp.entity.Customer;
import com.hexaware.onlinefooddeliveryapp.entity.FoodOrder;

public interface IFoodOrderService {

	public List<FoodOrder> getAllFoodOrder();

	public FoodOrder saveFoodOrder(@Valid FoodOrder foodOrder);

	public Optional<FoodOrder> getFoodOrderById(Long orderId);

	public FoodOrder updateFoodOrder(FoodOrder fdorder);

	public void deleteFoodOrderById(Long orderId);

//	public List<Integer> getAllFoodOrderPrice(Long customerId);

	
	
	
}
