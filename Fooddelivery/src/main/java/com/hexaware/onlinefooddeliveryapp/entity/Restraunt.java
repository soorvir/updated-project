package com.hexaware.onlinefooddeliveryapp.entity;

import java.sql.Date;
import java.util.ArrayList;
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
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "restraunt")
public class Restraunt {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="restraunt_id", nullable = false)
	  private Long restruantId;
	  @NotEmpty
	  @Size(min=2,message="First name should have atleast 2 charecters")
	  @Column(name = "owner_firstname")
	  private String ownerFirstName;
	  @Column(name = "owner_middlename")
	  private String ownerMiddleName;
	  @NotEmpty
	  @Size(min=2,message="Last name should have atleast 2 charecters")
	  @Column(name = "owner_lastname")
	  private String ownerLastName;
	  @NotEmpty
	  @Column(name = "restraunt_phonenumber")
	  private String restrauntPhoneNumber;
	  @NotEmpty
	  @Email
	  @Column(name = "restraunt_email")
	  private String restrauntEmail;

	  @NotEmpty
	  @Size(min=2,message="street name should have atleast 2 charecters")
	  @Column(name = "restraunt_street")
	  private String restrauntStreet;
	  @NotEmpty
	  @Size(min=2,message="city name should have atleast 2 charecters")
	  @Column(name = "restraunt_city")
	  private String restrauntCity;
	  @NotEmpty
	  @Size(min=2,message="country name should have atleast 2 charecters")
	  @Column(name = "restraunt_country")
	  private String restrauntCountry;
	  @NotEmpty
	  @Size(min=2,message="restraunt name should have atleast 2 charecters")
	  @Column(name = "restraunt_name")
	  private String restrauntName;
	  
	 
	  
	  @Column(name = "username",nullable = false)
	  private String username;
	  @Column(name = "password",nullable = false)
	  private String password;

	public Restraunt() {
		super();
	}

	public Restraunt(
			@NotEmpty @Size(min = 2, message = "First name should have atleast 2 charecters") String ownerFirstName,
			String ownerMiddleName,
			@NotEmpty @Size(min = 2, message = "Last name should have atleast 2 charecters") String ownerLastName,
			@NotEmpty String restrauntPhoneNumber, @NotEmpty @Email String restrauntEmail,
			@NotEmpty @Size(min = 2, message = "street name should have atleast 2 charecters") String restrauntStreet,
			@NotEmpty @Size(min = 2, message = "city name should have atleast 2 charecters") String restrauntCity,
			@NotEmpty @Size(min = 2, message = "country name should have atleast 2 charecters") String restrauntCountry,
			@NotEmpty @Size(min = 2, message = "restraunt name should have atleast 2 charecters") String restrauntName) {
		super();
		this.ownerFirstName = ownerFirstName;
		this.ownerMiddleName = ownerMiddleName;
		this.ownerLastName = ownerLastName;
		this.restrauntPhoneNumber = restrauntPhoneNumber;
		this.restrauntEmail = restrauntEmail;
		this.restrauntStreet = restrauntStreet;
		this.restrauntCity = restrauntCity;
		this.restrauntCountry = restrauntCountry;
		this.restrauntName = restrauntName;
	}
	
	

	public Restraunt(
			@NotEmpty @Size(min = 2, message = "First name should have atleast 2 charecters") String ownerFirstName,
			String ownerMiddleName,
			@NotEmpty @Size(min = 2, message = "Last name should have atleast 2 charecters") String ownerLastName,
			@NotEmpty String restrauntPhoneNumber, @NotEmpty @Email String restrauntEmail,
			@NotEmpty @Size(min = 2, message = "street name should have atleast 2 charecters") String restrauntStreet,
			@NotEmpty @Size(min = 2, message = "city name should have atleast 2 charecters") String restrauntCity,
			@NotEmpty @Size(min = 2, message = "country name should have atleast 2 charecters") String restrauntCountry,
			@NotEmpty @Size(min = 2, message = "restraunt name should have atleast 2 charecters") String restrauntName,
			String username, String password) {
		super();
		this.ownerFirstName = ownerFirstName;
		this.ownerMiddleName = ownerMiddleName;
		this.ownerLastName = ownerLastName;
		this.restrauntPhoneNumber = restrauntPhoneNumber;
		this.restrauntEmail = restrauntEmail;
		this.restrauntStreet = restrauntStreet;
		this.restrauntCity = restrauntCity;
		this.restrauntCountry = restrauntCountry;
		this.restrauntName = restrauntName;
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

	public Long getRestruantId() {
		return restruantId;
	}

	public void setRestruantId(Long restruantId) {
		this.restruantId = restruantId;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerMiddleName() {
		return ownerMiddleName;
	}

	public void setOwnerMiddleName(String ownerMiddleName) {
		this.ownerMiddleName = ownerMiddleName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getRestrauntPhoneNumber() {
		return restrauntPhoneNumber;
	}

	public void setRestrauntPhoneNumber(String restrauntPhoneNumber) {
		this.restrauntPhoneNumber = restrauntPhoneNumber;
	}

	public String getRestrauntEmail() {
		return restrauntEmail;
	}

	public void setRestrauntEmail(String restrauntEmail) {
		this.restrauntEmail = restrauntEmail;
	}

	public String getRestrauntStreet() {
		return restrauntStreet;
	}

	public void setRestrauntStreet(String restrauntStreet) {
		this.restrauntStreet = restrauntStreet;
	}

	public String getRestrauntCity() {
		return restrauntCity;
	}

	public void setRestrauntCity(String restrauntCity) {
		this.restrauntCity = restrauntCity;
	}

	public String getRestrauntCountry() {
		return restrauntCountry;
	}

	public void setRestrauntCountry(String restrauntCountry) {
		this.restrauntCountry = restrauntCountry;
	}

	public String getRestrauntName() {
		return restrauntName;
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	@Override
	public String toString() {
		return "Restraunt [restruantId=" + restruantId + ", ownerFirstName=" + ownerFirstName + ", ownerMiddleName="
				+ ownerMiddleName + ", ownerLastName=" + ownerLastName + ", restrauntPhoneNumber="
				+ restrauntPhoneNumber + ", restrauntEmail=" + restrauntEmail + ", restrauntStreet=" + restrauntStreet
				+ ", restrauntCity=" + restrauntCity + ", restrauntCountry=" + restrauntCountry + ", restrauntName="
				+ restrauntName + ", username=" + username + ", password=" + password + "]";
	}

	

	  
	  
	  
}


