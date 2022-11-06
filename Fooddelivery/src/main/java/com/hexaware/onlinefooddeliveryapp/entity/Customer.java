package com.hexaware.onlinefooddeliveryapp.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.aspectj.apache.bcel.ExceptionConstants;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;  
import java.time.Period;  


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="customer_id", nullable = false)
	  private Long customerId;
	  
	  @Size(min=3,message="cutomer name should contain minimum three alphabet")
	  @Column(name = "customer_first_name",nullable = false)
	  private String customerFirstName;
	  @Column(name = "customer_middle_name")
	  private String customerMiddleName;
	  @Size(min=3,message="cutomer last name should contain minimum three alphabet")
	  @Column(name = "customer_last_name",nullable = false)
	  private String customerLastName;
	  @Size(min=10,max=10,message="phone number must be of 10 digit")
	  @Column(name = "customer_phone_number",nullable = false)
	  private String customerPhoneNumber;
	  @Email
	  @Column(name = "customer_email",nullable = false)
	  private String customerEmail;
	  @Size(min=4,max=6)
	  @Column(name = "customer_gender",nullable = false)
	  private String customerGender;
	  
	  @Column(name = "customer_house_number",nullable = false)
	  private String customerHouseNumber;
	  @Column(name = "customer_street",nullable = false)
	  private String customerStreet;
	  @Column(name = "customer_city",nullable = false)
	  private String customerCity;
	  @Column(name = "customer_country",nullable = false)
	  private String customerCountry;
	  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/mm/dd")
	  @Column(name = "customer_date_of_birth",nullable = false)
	  private String customerDateOfBirth;
	  @Column(name = "customer_age")
	  private int customerAge;
	  @Column(name = "username",nullable = false)
	  private String username;
	  @Column(name = "password",nullable = false)
	  private String password;
//	  @Formula(value = "date_part('year',AGE(current_date,customer_date_of_birth))")
//	  @Formula(value = "Period.between(customer_date_of_birth, currentDate).getYears()")
//	  private Integer customerAge;
	  
	  
	  
	  public Customer() {
		  
	  }



	
	

	public Customer(Long customerId,
			@Size(min = 3, message = "cutomer name should contain minimum three alphabet") String customerFirstName,
			String customerMiddleName,
			@Size(min = 3, message = "cutomer last name should contain minimum three alphabet") String customerLastName,
			@Size(min = 10, max = 10, message = "phone number must be of 10 digit") String customerPhoneNumber,
			@Email String customerEmail, @Size(min = 4, max = 6) String customerGender, String customerHouseNumber,
			String customerStreet, String customerCity, String customerCountry, String customerDateOfBirth,
			int customerAge) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerMiddleName = customerMiddleName;
		this.customerLastName = customerLastName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmail = customerEmail;
		this.customerGender = customerGender;
		this.customerHouseNumber = customerHouseNumber;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerCountry = customerCountry;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAge = customerAge;
	}






	public Customer(
			@Size(min = 3, message = "cutomer name should contain minimum three alphabet") String customerFirstName,
			String customerMiddleName,
			@Size(min = 3, message = "cutomer last name should contain minimum three alphabet") String customerLastName,
			@Size(min = 10, max = 10, message = "phone number must be of 10 digit") String customerPhoneNumber,
			@Email String customerEmail, @Size(min = 4, max = 6) String customerGender, String customerHouseNumber,
			String customerStreet, String customerCity, String customerCountry, String customerDateOfBirth,
			int customerAge, String username, String password) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerMiddleName = customerMiddleName;
		this.customerLastName = customerLastName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmail = customerEmail;
		this.customerGender = customerGender;
		this.customerHouseNumber = customerHouseNumber;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerCountry = customerCountry;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAge = customerAge;
		this.username = username;
		this.password = password;
	}






	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}






	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public String getCustomerFirstName() {
		return customerFirstName;
	}



	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}



	public String getCustomerMiddleName() {
		return customerMiddleName;
	}



	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}



	public String getCustomerLastName() {
		return customerLastName;
	}



	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}



	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}



	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public String getCustomerGender() {
		return customerGender;
	}



	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}



	public String getCustomerHouseNumber() {
		return customerHouseNumber;
	}



	public void setCustomerHouseNumber(String customerHouseNumber) {
		this.customerHouseNumber = customerHouseNumber;
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



	public String getCustomerCountry() {
		return customerCountry;
	}



	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}



	public String getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}



	public void setCustomerDateOfBirth(String customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}

	

	public Integer getCustomerAge() {
		return customerAge;
	}



	public Customer(
			@Size(min = 3, message = "cutomer name should contain minimum three alphabet") String customerFirstName,
			String customerMiddleName,
			@Size(min = 3, message = "cutomer last name should contain minimum three alphabet") String customerLastName,
			@Size(min = 10, max = 10, message = "phone number must be of 10 digit") String customerPhoneNumber,
			@Email String customerEmail, @Size(min = 4, max = 6) String customerGender, String customerHouseNumber,
			String customerStreet, String customerCity, String customerCountry, String customerDateOfBirth,
			Integer customerAge) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerMiddleName = customerMiddleName;
		this.customerLastName = customerLastName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmail = customerEmail;
		this.customerGender = customerGender;
		this.customerHouseNumber = customerHouseNumber;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerCountry = customerCountry;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAge = customerAge;
	
	}



	



	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}






	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerMiddleName=" + customerMiddleName + ", customerLastName=" + customerLastName
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerEmail=" + customerEmail
				+ ", customerGender=" + customerGender + ", customerHouseNumber=" + customerHouseNumber
				+ ", customerStreet=" + customerStreet + ", customerCity=" + customerCity + ", customerCountry="
				+ customerCountry + ", customerDateOfBirth=" + customerDateOfBirth + ", customerAge=" + customerAge
				+ ", username=" + username + ", password=" + password +"]";
	}



	



	
 
	  
	}
	

