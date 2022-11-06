package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Id;



@Entity
@Table(name= "food_item")
public class FoodItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="food_id")
	  private Long foodItemId;
	
	
	@Column(name = "food_item_name", nullable = false)
	private String foodItemName;
	@Column(name = "food_item_type",nullable = false)
	private String foodItemType;
	@Column(name = "food_item_category",nullable = false)
	private String foodItemCategory;
	@Column(name = "food_item_price",nullable = false)
	private Integer foodItemPrice;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_restraunt_restraunt_id")
//	private Restraunt restraunt;
	@Column(name="restraunt_id")
	 private Long restruantId;
	
	
	public FoodItem() {

	}


	public Long getFoodItemId() {
		return foodItemId;
	}


	public void setFoodItemId(Long foodItemId) {
		this.foodItemId = foodItemId;
	}


	public String getFoodItemName() {
		return foodItemName;
	}


	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}


	public String getFoodItemType() {
		return foodItemType;
	}


	public void setFoodItemType(String foodItemType) {
		this.foodItemType = foodItemType;
	}


	public String getFoodItemCategory() {
		return foodItemCategory;
	}


	public void setFoodItemCategory(String foodItemCategory) {
		this.foodItemCategory = foodItemCategory;
	}


	public Integer getFoodItemPrice() {
		return foodItemPrice;
	}


	public void setFoodItemPrice(Integer foodItemPrice) {
		this.foodItemPrice = foodItemPrice;
	}


	public Long getRestruantId() {
		return restruantId;
	}


	public void setRestruantId(Long restruantId) {
		this.restruantId = restruantId;
	}


	public FoodItem(String foodItemName, String foodItemType, String foodItemCategory, Integer foodItemPrice,
			Long restruantId) {
		super();
		this.foodItemName = foodItemName;
		this.foodItemType = foodItemType;
		this.foodItemCategory = foodItemCategory;
		this.foodItemPrice = foodItemPrice;
		this.restruantId = restruantId;
	}


	@Override
	public String toString() {
		return "FoodItem [foodItemId=" + foodItemId + ", foodItemName=" + foodItemName + ", foodItemType="
				+ foodItemType + ", foodItemCategory=" + foodItemCategory + ", foodItemPrice=" + foodItemPrice
				+ ", restruantId=" + restruantId + "]";
	}

}
