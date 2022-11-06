package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bill")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Long billId;
	@Column(name = "bill_total_amount",nullable = false)
	private Integer billTotalAmount;
	@Column(name ="bill_description")
	private String billDescription; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_customer_customer_id")
	private Customer customer;
	
	
	public Bill() {
		
	}

	public Bill( int billTotalAmount) {
		super();
		this.billTotalAmount = billTotalAmount;
	}
	
	

	public Bill(Long billId, int billTotalAmount, Customer customer) {
		super();
		this.billId = billId;
		this.billTotalAmount = billTotalAmount;
		this.customer = customer;
	}

	public Bill(Integer billTotalAmount, String billDescription, Customer customer) {
		super();
		this.billTotalAmount = billTotalAmount;
		this.billDescription = billDescription;
		this.customer = customer;
	}

	public String getBillDescription() {
		return billDescription;
	}

	public void setBillDescription(String billDescription) {
		this.billDescription = billDescription;
	}

	public void setBillTotalAmount(Integer billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}
	
	
	


	

	@Override
	public String toString() {
		return "BillEntity [billId=" + billId + ", billTotalAmount=" + billTotalAmount
				 + "]";
	}
	
	
}
