package com.hexaware.onlinefooddeliveryapp.entity;

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

@Entity
@Table(name = "place_order")
public class PlaceOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long placeOrderId;
	
	@Column(name = "status",nullable= false)
	private String status;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "fk_restraunt_restraunt_id")
	  private Restraunt restraunt;
	 
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "fk_item_order_item_order_id")
	  private FoodOrder foodOrder;
	 
	 public PlaceOrder() {
		 
	 }
	 
	 
	 
	 

	public PlaceOrder(String status, Restraunt restraunt, FoodOrder foodOrder) {
		super();
		this.status = status;
		this.restraunt = restraunt;
		this.foodOrder = foodOrder;
	}





	public Long getPlaceOrderId() {
		return placeOrderId;
	}

	public void setPlaceOrderId(Long placeOrderId) {
		this.placeOrderId = placeOrderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Restraunt getRestraunt() {
		return restraunt;
	}

	public void setRestraunt(Restraunt restraunt) {
		this.restraunt = restraunt;
	}

	public FoodOrder getFoodOrder() {
		return foodOrder;
	}

	public void setFoodOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	@Override
	public String toString() {
		return "PlaceOrder [placeOrderId=" + placeOrderId + ", status=" + status + ", restraunt=" + restraunt
				+ ", foodOrder=" + foodOrder + "]";
	}
	 
	 
	 
	 
}
