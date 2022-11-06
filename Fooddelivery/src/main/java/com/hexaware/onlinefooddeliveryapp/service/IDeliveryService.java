package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.entity.Delivery;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;

public interface IDeliveryService  {

	public List<Delivery> getAllDeliveries();
	public Delivery saveDelivery(Delivery delivery);
	public Delivery updateDelivery( Delivery delivery) throws ResourceNotFoundException;
	public Optional<Delivery> getDeliveriesById(Long deliveryId);
	public void deleteDeliveriesById(Long deliveryId);
}
