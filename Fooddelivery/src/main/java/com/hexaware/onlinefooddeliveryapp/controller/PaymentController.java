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

import com.hexaware.onlinefooddeliveryapp.entity.Payment;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IPaymentService;
@CrossOrigin("*")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private IPaymentService paySerivce;
	
	@GetMapping("/listpayment")
	public List<Payment> getAllPayment(){
		return paySerivce.getAllPayment();
	}
	
	@PostMapping("/savepayment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paySerivce.savePayment(payment);
	}
	
	@PutMapping("/updatepayment/{pid}")
	public Payment updatePayment(@RequestBody Payment newPayment,@PathVariable("pid")Long transactionId)throws ResourceNotFoundException{
		Payment pay=paySerivce.getTransactionById(transactionId)
				.orElseThrow(() -> new ResourceNotFoundException("Seller does not exists with the given Seller Id" +transactionId));
		pay.setCardNumber(newPayment.getCardNumber());
		pay.setCvvNumber(newPayment.getCvvNumber());
		return paySerivce.updatePayment(pay);
	}
	
	
	@GetMapping("/findPayment/{pid}")
	public Payment getTransactionById(@PathVariable("pid")Long transactionId) {
		return paySerivce.getTransactionById(transactionId).get();
	}
	
	@DeleteMapping("/deletePayment/{pid}")
	public void deleteTransactionById(@PathVariable("pid")Long transactionId)
	{
		paySerivce.deleteTransactionById(transactionId);
	}
}
