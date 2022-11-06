package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.PlaceOrder;
import com.hexaware.onlinefooddeliveryapp.repository.PlaceOrderRepository;

@Service
public class PlaceOrderServiceImpl implements IPlaceOrderService {
	
	@Autowired
	private PlaceOrderRepository placeOrderRepository;
	
	@Override
	public List<PlaceOrder> getAllPlaceOrder() {
		
		return placeOrderRepository.findAll();
	}

	@Override
	public PlaceOrder saveBill(PlaceOrder placeOrder) {
		// TODO Auto-generated method stub
		return placeOrderRepository.save(placeOrder);
	}

	@Override
	public Optional<PlaceOrder> getPlaceOrderById(Long placeOrderId) {
		// TODO Auto-generated method stub
		return placeOrderRepository.findById(placeOrderId);
	}

	@Override
	public PlaceOrder updatePlaceOrder(PlaceOrder placeOrder) {
		// TODO Auto-generated method stub
		return placeOrderRepository.save(placeOrder);
	}

	@Override
	public void deleteBillById(Long placeOrderId) {
		// TODO Auto-generated method stub
		placeOrderRepository.deleteById(placeOrderId);
	}

}
