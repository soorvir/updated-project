package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.hexaware.onlinefooddeliveryapp.entity.Customer;
import com.hexaware.onlinefooddeliveryapp.entity.FoodOrder;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IFoodOrderService;
@CrossOrigin("*")
@RestController
@RequestMapping("/foodorder")
public class FoodOrderController {
	
	@Autowired
	private IFoodOrderService foodOrderService;
	
	@GetMapping("/listfoodorder")
	public List<FoodOrder> getAllFoodOrder(){
		return foodOrderService.getAllFoodOrder();
	}
	
	@PostMapping("/savefoodorder")
	public FoodOrder saveFoodOrder(@Valid @RequestBody FoodOrder foodOrder) {
		return foodOrderService.saveFoodOrder(foodOrder);
	}
	
	@PutMapping("/updatefoodorder/{oid}")
	public FoodOrder updateFoodOrder(@Valid @RequestBody FoodOrder newFoodOrder,@PathVariable("oid")Long OrderId)throws ResourceNotFoundException{
		FoodOrder fdorder=foodOrderService.getFoodOrderById(OrderId)
				.orElseThrow(() -> new ResourceNotFoundException("Food Order does not exists with the given order Id:" +OrderId));
		fdorder.setQuantity(newFoodOrder.getQuantity());
		fdorder.setFoodPrice(newFoodOrder.getFoodPrice());
		return foodOrderService.updateFoodOrder(fdorder);
	}
	
	@GetMapping("/findfoodorder/{oid}")
	public FoodOrder getFoodOrderById(@PathVariable("oid")Long OrderId) {
		return foodOrderService.getFoodOrderById(OrderId).get();
	}
	
	@DeleteMapping("/deletefoodorder/{oid}")
	public void deleteFoodOrderById(@PathVariable("oid")Long OrderId)
	{
		foodOrderService.deleteFoodOrderById(OrderId);
	}
	
//	@GetMapping("/listfoodorderprice/{c_id}")
//	public List<Integer> getAllFoodOrderPrice(@PathVariable("c_id") Long customerId){
//		return foodOrderService.getAllFoodOrderPrice(customerId);
//	}
//	
//	@PutMapping("/calcutateTotalAmount/{cid}")
//	public int calculateTotalAmount(@PathVariable("cid") Long customerId)throws ResourceNotFoundException{
//		List<Integer> foodOrder=foodOrderService.getAllFoodOrderPrice(customerId);
//
//		
//		int sum = foodOrder.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//		
//		return sum;
//	}
}
