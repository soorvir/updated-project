package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.onlinefooddeliveryapp.entity.FoodItem;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.FoodItemRepository;

@Service
public class FoodItemServiceImpl implements IFoodItemService{

	@Autowired
	private FoodItemRepository foodItemRepository;
	
	@Override
	public List<FoodItem> getAllFoodItem() {
		// TODO Auto-generated method stub
		return foodItemRepository.findAll();
	}
	@Override
	public FoodItem saveFoodItem(FoodItem foodItem) {
		return foodItemRepository.save(foodItem);
	}
	@Override
	public FoodItem updateFoodItem(FoodItem foodItem) throws ResourceNotFoundException{
		
		return foodItemRepository.save(foodItem);
	}
	@Override
	public Optional<FoodItem> getFoodItemById(Long foodItemId) {
		// TODO Auto-generated method stub
		return foodItemRepository.findById(foodItemId);
	}
	@Override
	public void deleteFoodItemById(Long foodItemId) {
		// TODO Auto-generated method stub
		foodItemRepository.deleteById(foodItemId);;
	}
	@Override
	public List<FoodItem> getFoodItemByFoodName(String foodItemName) {
		
		return foodItemRepository.findByFoodItemName(foodItemName);
	}
	
}
