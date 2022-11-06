package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.onlinefooddeliveryapp.entity.Delivery;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IDeliveryService;
@CrossOrigin("*")
@RestController
@RequestMapping("/deliverypartner")
public class DeliveryController {

	@Autowired
	private IDeliveryService deliveryService;
	@GetMapping("/listdeliverypartner")
	public List<Delivery> getAllDeliveries(){
		return deliveryService.getAllDeliveries();
	}
	@PostMapping("/savedelivery")
	public Delivery saveDelivery(@RequestBody Delivery delivery) {
		return deliveryService.saveDelivery(delivery);
	}
	@PutMapping("/updatedelivery/{did}")
	public Delivery updateDelivery(@RequestBody Delivery newDelivery,@PathVariable("did") Long deliveryId) throws ResourceNotFoundException{
	  Delivery delivery = deliveryService.getDeliveriesById(deliveryId).orElseThrow(() -> new ResourceNotFoundException("delivery not exists with Id" + deliveryId));
	 
	  delivery.setCustomerName(newDelivery.getCustomerName());
	  delivery.setCustomerMoblieNumber(newDelivery.getCustomerMoblieNumber());
	  delivery.setCustoerHouseNumber(newDelivery.getCustoerHouseNumber());
	  delivery.setCustomerStreet(newDelivery.getCustomerStreet());
	  delivery.setCustomerCity(newDelivery.getCustomerCity());
	  delivery.setPinCode(newDelivery.getPinCode());
	  delivery.setCustomerCountry(newDelivery.getCustomerCountry());
	  delivery.setDeliveryId(newDelivery.getDeliveryId());
	  delivery.setDeliveryPartnerName(newDelivery.getDeliveryPartnerName());
	  delivery.setDeliveryPartnerNumber(newDelivery.getDeliveryPartnerNumber());
	  delivery.setPlaceOrder(newDelivery.getPlaceOrder());
		return deliveryService.updateDelivery(delivery);
    }
	@GetMapping("/finddelivery/{did}")
	public Delivery getDeliveriesById(@PathVariable("did") Long deliveryId){
		return deliveryService.getDeliveriesById(deliveryId).get();
	}
	@DeleteMapping("/deletedelivery/{did}")
	public void deleteDeliveriesById(@PathVariable("did") Long deliveryId){
		deliveryService.deleteDeliveriesById(deliveryId);
	}
}