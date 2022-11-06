package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name = "delivery")

public class Delivery {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deliveryId;
	@Column(name = "deliveryPartnerName")
	private String deliveryPartnerName;
	@Column(name = "deliveryPartnerNumber")
	private Long deliveryPartnerNumber;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerMoblieNumber")
	private Long customerMoblieNumber;
	@Column(name = "customerHousenumber")
	private int custoerHouseNumber;
	@Column(name = "customerStreet")
	private String customerStreet;
	@Column(name = "customerCity")
	private String customerCity;
	@Column(name = "pinCode")
	private int pinCode;
	@Column(name = "customerCountry")
	private String customerCountry;
	@Temporal(TemporalType.DATE)
	private Date deliveryDate = new Date(System.currentTimeMillis());
	@Temporal(TemporalType.TIME)
	private Date deliveryTime = new Date(System.currentTimeMillis());
	

	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
	CascadeType.DETACH,CascadeType.REFRESH})
	private List<PlaceOrder> placeOrder = new ArrayList<PlaceOrder>();

	public Delivery() {
	
		}

	
	
	

	public Delivery(String deliveryPartnerName, Long deliveryPartnerNumber, String customerName,
			Long customerMoblieNumber, int custoerHouseNumber, String customerStreet, String customerCity, int pinCode,
			String customerCountry, Date deliveryDate, Date deliveryTime, List<PlaceOrder> placeOrder) {
		super();
		this.deliveryPartnerName = deliveryPartnerName;
		this.deliveryPartnerNumber = deliveryPartnerNumber;
		this.customerName = customerName;
		this.customerMoblieNumber = customerMoblieNumber;
		this.custoerHouseNumber = custoerHouseNumber;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.pinCode = pinCode;
		this.customerCountry = customerCountry;
		this.deliveryDate = deliveryDate;
		this.deliveryTime = deliveryTime;
		this.placeOrder = placeOrder;
	}





	public List<PlaceOrder> getPlaceOrder() {
		return placeOrder;
	}





	public void setPlaceOrder(List<PlaceOrder> placeOrder) {
		this.placeOrder = placeOrder;
	}





	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDeliveryPartnerName() {
		return deliveryPartnerName;
	}

	public void setDeliveryPartnerName(String deliveryPartnerName) {
		this.deliveryPartnerName = deliveryPartnerName;
	}

	public Long getDeliveryPartnerNumber() {
		return deliveryPartnerNumber;
	}

	public void setDeliveryPartnerNumber(Long deliveryPartnerNumber) {
		this.deliveryPartnerNumber = deliveryPartnerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerMoblieNumber() {
		return customerMoblieNumber;
	}

	public void setCustomerMoblieNumber(Long customerMoblieNumber) {
		this.customerMoblieNumber = customerMoblieNumber;
	}

	public int getCustoerHouseNumber() {
		return custoerHouseNumber;
	}

	public void setCustoerHouseNumber(int custoerHouseNumber) {
		this.custoerHouseNumber = custoerHouseNumber;
	}

	public String getCustomerStreet() {
		return customerStreet;
	}

	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}





	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", deliveryPartnerName=" + deliveryPartnerName
				+ ", deliveryPartnerNumber=" + deliveryPartnerNumber + ", customerName=" + customerName
				+ ", customerMoblieNumber=" + customerMoblieNumber + ", custoerHouseNumber=" + custoerHouseNumber
				+ ", customerStreet=" + customerStreet + ", customerCity=" + customerCity + ", pinCode=" + pinCode
				+ ", customerCountry=" + customerCountry + ", deliveryDate=" + deliveryDate + ", deliveryTime="
				+ deliveryTime + ", placeOrder=" + placeOrder + "]";
	}

	
}
		


  
