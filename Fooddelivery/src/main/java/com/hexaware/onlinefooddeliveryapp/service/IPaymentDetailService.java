package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.entity.PaymentDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;

public interface IPaymentDetailService {
	
	public List<PaymentDetail> getAllPaymentDetail();
	public PaymentDetail savePaymentDetail(PaymentDetail paymentdetail);
	public PaymentDetail updatePaymentDetail(PaymentDetail paymentdetail)throws ResourceNotFoundException;
	public Optional<PaymentDetail> getPaymentdetailById(Long paymentDetailId);
	public void  deletePaymentdetailById(Long paymentDetailId);
}
