package com.hexaware.onlinefooddeliveryapp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "payment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Long transactionId;
	@Column(name = "payment_cvvnumber",nullable = false)
	private int cvvNumber;
	@Column(name = "payment_cardnumber",nullable = false)
	private Long cardNumber;
	@Column(name="payment_amount",nullable = false)
	private double amount;
	@Column(name="payment_date")
	@Temporal(TemporalType.DATE)
	private Date date=new Date(System.currentTimeMillis());
	@Column(name="payment_time")
	@Temporal(TemporalType.TIME)
	private Date time=new  Date(System.currentTimeMillis());
	@Column(name="foodOrderId")
	private Long foodOrderId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="paymentDetailId")
	 private PaymentDetail paymentDetails;

	
	public PaymentDetail getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetail paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	

	public Payment() {

	}

	public int getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getFoodOrderId() {
		return foodOrderId;
	}

	public void setFoodOrderId(Long foodOrderId) {
		this.foodOrderId = foodOrderId;
	}

	public Payment(int cvvNumber, Long cardNumber, double amount, Date date, Date time) {
		super();
		this.cvvNumber = cvvNumber;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.date = date;
		this.time = time;
	}

	

	public Payment(int cvvNumber, Long cardNumber, double amount, Date date, Date time, Long foodOrderId,
			PaymentDetail paymentDetails) {
		super();
		this.cvvNumber = cvvNumber;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.date = date;
		this.time = time;
		this.foodOrderId = foodOrderId;
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", cvvNumber=" + cvvNumber + ", cardNumber=" + cardNumber
				+ ", amount=" + amount + ", date=" + date + ", time=" + time + "]";
	}
	
	
	

}

