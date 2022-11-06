package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;


import com.hexaware.onlinefooddeliveryapp.entity.OrderDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;

public interface IOrderDetailService {

	public List<OrderDetail> getAllOrders();
	public OrderDetail saveOrder(OrderDetail order);
	public OrderDetail updateOrder( OrderDetail order) throws ResourceNotFoundException;
	public Optional<OrderDetail> getOrderById(Long orderId);
	public void deleteOrderById(Long orderId);
}
