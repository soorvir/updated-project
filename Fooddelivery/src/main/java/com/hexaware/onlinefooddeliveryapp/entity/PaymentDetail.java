package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment_detail")
public class PaymentDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paymentDetailId")
	private Long paymentDetailId;
	@Column(name="paymentDetail_status",nullable = false)
	private String status;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_customer_customer_id")
//	private Customer customer;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="paymentDetail_id")
//	private PaymentDetail paymentDetail;
	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public PaymentDetail() {
		
	}

	public Long getPaymentDetailId() {
		return paymentDetailId;
	}

	public void setPaymentDetailId(Long paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}
	
	
//	public PaymentDetail(String status, Customer customer) {
//		super();
//		this.status = status;
//		this.customer = customer;
//	}
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PaymentDetail(String status) {
		super();
		this.status = status;
	}

	@Override
	public String toString() {
		return "PaymentDetail [paymentDetailId=" + paymentDetailId + ", status=" + status + "]";
	}
	
}
