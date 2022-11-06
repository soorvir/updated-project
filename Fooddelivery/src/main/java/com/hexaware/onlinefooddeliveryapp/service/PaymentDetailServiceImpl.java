package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.PaymentDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.PaymentDetailRepository;

@Service
public class PaymentDetailServiceImpl implements IPaymentDetailService{
	
	@Autowired
	private PaymentDetailRepository paymentdetailrepository;

	@Override
	public List<PaymentDetail> getAllPaymentDetail() {
		return paymentdetailrepository.findAll();
	}

	@Override
	public PaymentDetail savePaymentDetail(PaymentDetail paymentdetail) {
		return paymentdetailrepository.save(paymentdetail);
	}

	@Override
	public Optional<PaymentDetail> getPaymentdetailById(Long paymentDetailId) {
		return paymentdetailrepository.findById(paymentDetailId);
	}

	@Override
	public void deletePaymentdetailById(Long paymentDetailId) {
		paymentdetailrepository.deleteById(paymentDetailId);
		
	}

	@Override
	public PaymentDetail updatePaymentDetail(PaymentDetail paymentdetail) throws ResourceNotFoundException {
		return paymentdetailrepository.save(paymentdetail);
	}
}
