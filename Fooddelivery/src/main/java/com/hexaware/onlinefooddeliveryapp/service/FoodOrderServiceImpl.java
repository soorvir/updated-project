package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Customer;
import com.hexaware.onlinefooddeliveryapp.entity.FoodOrder;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.FoodOrderRepository;

@Service
public class FoodOrderServiceImpl implements IFoodOrderService{
	
	@Autowired
	private FoodOrderRepository foodOrderRepository;

	@Override
	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderRepository.findAll();
	}

	@Override
	public FoodOrder saveFoodOrder(@Valid FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
	}

	@Override
	public Optional<FoodOrder> getFoodOrderById(Long OrderId) {
		return foodOrderRepository.findById(OrderId);
	}

	@Override
	public void deleteFoodOrderById(Long orderId) {
		foodOrderRepository.deleteById(orderId);
		
	}

	@Override
	public FoodOrder updateFoodOrder(FoodOrder foodorder) {
		return foodOrderRepository.save(foodorder);
	}

//	@Override
//	public List<Integer> getAllFoodOrderPrice(Long customerId) {
//		// TODO Auto-generated method stub
//		return foodOrderRepository.getFoodOrderPriceById(customerId);
//	}
	
	
	
}
