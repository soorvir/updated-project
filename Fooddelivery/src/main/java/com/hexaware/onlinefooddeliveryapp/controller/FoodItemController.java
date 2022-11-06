package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hexaware.onlinefooddeliveryapp.entity.FoodItem;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IFoodItemService;

@CrossOrigin("*")
@RequestMapping("/fooditem")
@RestController
public class FoodItemController {

	@Autowired
	private IFoodItemService foodItemService;
	
	@GetMapping("/listfooditem")
	public List<FoodItem> getAllFoodItem(){
		return foodItemService.getAllFoodItem();
	}
	
	@PostMapping("/savefooditem")
	public FoodItem saveFoodItem(@RequestBody FoodItem foodItem) {
		return foodItemService.saveFoodItem(foodItem);
	}
	@PutMapping("/updatefooditem/{pid}")
	public FoodItem updateFoodItem(@RequestBody FoodItem newFoodItem,@PathVariable("pid") Long foodItemId) throws ResourceNotFoundException{
	  FoodItem foodItem = foodItemService.getFoodItemById(foodItemId).orElseThrow(() -> new ResourceNotFoundException("foodItem not exists with Id" + foodItemId));
	  
	  foodItem.setFoodItemName(newFoodItem.getFoodItemName());
	  foodItem.setFoodItemPrice(newFoodItem.getFoodItemPrice());
	 foodItem.setFoodItemType(newFoodItem.getFoodItemType());
	  foodItem.setFoodItemCategory(newFoodItem.getFoodItemCategory());
		return foodItemService.updateFoodItem(foodItem);
    }
	@GetMapping("/findfooditem/{fid}")
	public FoodItem getFoodItemById(@PathVariable("fid") Long foodItemId){
		return foodItemService.getFoodItemById(foodItemId).get();
	}
	@DeleteMapping("/deletefooditem/{pid}")
	public void deleteFoodItemById(@PathVariable("pid") Long foodItemId){
		foodItemService.deleteFoodItemById(foodItemId);
	}
	
	@GetMapping("/findfoodname/{foodname}")
	public List<FoodItem> getFoodItemByFoodName(@PathVariable("foodname") String foodItemName) {
		return foodItemService.getFoodItemByFoodName(foodItemName);
	}
	
	

}