package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Delivery;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.DeliveryRepository;

@Service
public class DeliveryServiceImpl implements  IDeliveryService{

	@Autowired
	private DeliveryRepository deliveryRepository;
	@Override
	public List<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		return deliveryRepository.findAll();
	}
	@Override
	public Delivery saveDelivery(Delivery delivery) {
		return deliveryRepository.save(delivery);
	}
	@Override
	public Delivery updateDelivery(Delivery delivery) throws ResourceNotFoundException{
		
		return deliveryRepository.save(delivery);
	}
	@Override
	public Optional<Delivery> getDeliveriesById(Long deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(deliveryId);
	}
	@Override
	public void deleteDeliveriesById(Long deliveryId) {
		// TODO Auto-generated method stub
		deliveryRepository.deleteById(deliveryId);;
	}

}
