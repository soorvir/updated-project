package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.onlinefooddeliveryapp.entity.OrderDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

	@Autowired
	private OrderDetailRepository orderRepository;
	@Override
	public List<OrderDetail> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
	@Override
	public OrderDetail saveOrder(OrderDetail order) {
		return orderRepository.save(order);
	}
	@Override
	public OrderDetail updateOrder(OrderDetail order) throws ResourceNotFoundException{
		
		return orderRepository.save(order);
	}
	@Override
	public Optional<OrderDetail> getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId);
	}
	@Override
	public void deleteOrderById(Long orderId) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(orderId);;
	}

}
