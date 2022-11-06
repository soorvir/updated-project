package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.onlinefooddeliveryapp.entity.PaymentDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IPaymentDetailService;

@RestController
@RequestMapping("/paymentdetail")
public class PaymentDetailController {
	
	@Autowired
	private IPaymentDetailService paydetailservice;
	
	@GetMapping("/listpaymentdetail")
	public List<PaymentDetail> getAllPaymentDetail() {
		return paydetailservice.getAllPaymentDetail();
	}
	
	@PostMapping("/savepaymentdetail")
	public PaymentDetail savePaymentDetail(@RequestBody PaymentDetail paymentdetail) {
		return paydetailservice.savePaymentDetail(paymentdetail);
	}
	
	
	@PutMapping("/updatepaymentdetail/{pdid}")
	public PaymentDetail updatePaymentDetail(@RequestBody PaymentDetail newPaymentDetail,@PathVariable("pdid")Long paymentDetailId)throws ResourceNotFoundException{
		PaymentDetail paydetail=paydetailservice.getPaymentdetailById(paymentDetailId)
				.orElseThrow(() -> new ResourceNotFoundException("Payment Detail does not exists with the given paymentDetailId  " +paymentDetailId));
		paydetail.setStatus(newPaymentDetail.getStatus());
		return paydetailservice.updatePaymentDetail(paydetail);
	}
	
	
	@GetMapping("/findpaymentdetail/{pdid}")
	public PaymentDetail getPaymentdetailById(@PathVariable("pdid")Long paymentDetailId) {
		return paydetailservice.getPaymentdetailById(paymentDetailId).get();
	}
	
	@DeleteMapping("/deletepaymentdetail/{pdid}")
	public void  deletePaymentdetailById(@PathVariable("pdid")Long paymentDetailId) {
		paydetailservice.deletePaymentdetailById(paymentDetailId);
	}
}
