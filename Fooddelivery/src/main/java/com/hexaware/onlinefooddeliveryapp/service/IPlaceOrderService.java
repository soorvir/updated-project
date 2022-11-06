package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.entity.PlaceOrder;

public interface IPlaceOrderService {

	public List<PlaceOrder> getAllPlaceOrder();

	public PlaceOrder saveBill(PlaceOrder placeOrder);

	public Optional<PlaceOrder> getPlaceOrderById(Long placeOrderId);

	public PlaceOrder updatePlaceOrder(PlaceOrder placeOrder);

	public void deleteBillById(Long placeOrderId);
	
	
}
