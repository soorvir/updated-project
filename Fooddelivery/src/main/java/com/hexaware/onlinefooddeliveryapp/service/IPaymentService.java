package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.entity.Payment;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;

public interface IPaymentService {
	
	public List<Payment> getAllPayment();
	public Payment savePayment(Payment payment);
	public Payment updatePayment(Payment payment)throws ResourceNotFoundException;
	public Optional<Payment> getTransactionById(Long transactionId);
	public void deleteTransactionById(Long transactionId);
}
