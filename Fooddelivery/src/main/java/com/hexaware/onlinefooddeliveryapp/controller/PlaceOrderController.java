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

import com.hexaware.onlinefooddeliveryapp.entity.Bill;
import com.hexaware.onlinefooddeliveryapp.entity.PlaceOrder;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IBillService;
import com.hexaware.onlinefooddeliveryapp.service.IPlaceOrderService;
@CrossOrigin("*")
@RestController
@RequestMapping
public class PlaceOrderController {
	
	@Autowired
	private IPlaceOrderService placeOrderService;
	
	@GetMapping("/listplaceorder")
	public List<PlaceOrder> getAllPlaceOrder(){
		return placeOrderService.getAllPlaceOrder();
	}
	
	@PostMapping("/savePlaceOrder")
	public PlaceOrder savePlaceOrder(@RequestBody PlaceOrder placeOrder) {
		return placeOrderService.saveBill(placeOrder);
	}
	
	@PutMapping("/updateplaceorder/{pOrder_id}")
	public PlaceOrder updatePlaceOrder(@RequestBody PlaceOrder newPlaceOrder,@PathVariable("pOrder_id") Long placeOrderId) throws ResourceNotFoundException {
		PlaceOrder placeOrder =  placeOrderService.getPlaceOrderById(placeOrderId)
				.orElseThrow(() -> new ResourceNotFoundException("place order not exists with id" +placeOrderId));

		placeOrder.setStatus(newPlaceOrder.getStatus());
		placeOrder.setFoodOrder(newPlaceOrder.getFoodOrder());
		placeOrder.setRestraunt(newPlaceOrder.getRestraunt());
		return placeOrderService.updatePlaceOrder(placeOrder);
		
	}
	
	@GetMapping("/findplaceorder/{pOrder_id}")
	public PlaceOrder getPlaceOrderById(@PathVariable("pOrder_id") Long placeOrderId){
		return placeOrderService.getPlaceOrderById(placeOrderId).get();
	}
	
	@DeleteMapping("/deleteplaceorder/{pOrder_id}")
	public void deletePlaceOrderById(@PathVariable("pOrder_id") Long placeOrderId){
		placeOrderService.deleteBillById(placeOrderId);
	}
	
}
