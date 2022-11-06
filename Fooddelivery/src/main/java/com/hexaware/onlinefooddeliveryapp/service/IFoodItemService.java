package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;


import com.hexaware.onlinefooddeliveryapp.entity.FoodItem;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;

public interface IFoodItemService {
	public List<FoodItem> getAllFoodItem();
	public FoodItem saveFoodItem(FoodItem foodItem);
	public FoodItem updateFoodItem(FoodItem foodItem) throws ResourceNotFoundException;
	public Optional<FoodItem> getFoodItemById(Long foodItemId);
	public void deleteFoodItemById(Long foodItemId);
	public List<FoodItem> getFoodItemByFoodName(String foodItemName);
	
}