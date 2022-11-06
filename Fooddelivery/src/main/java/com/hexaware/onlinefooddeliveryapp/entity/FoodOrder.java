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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "foodorder")
public class FoodOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="foodOrderId")
	private Long foodOrderId;
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "food_quantity")
	private int quantity;
	@Column(name = "foodOrderDate")
	@Temporal(TemporalType.DATE)
	private Date orderDate=new Date(System.currentTimeMillis());
	@Column(name = "foodOrderTime")
	@Temporal(TemporalType.TIME)
	private Date orderTime=new Date(System.currentTimeMillis());
	@Column(name = "foodPrice")
//	@Formula(("food_quantity*(select food_item_price from food_item f where f.id = foodorder_fkid)"))
	private double foodPrice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foodItem_fkid" ,referencedColumnName = "foodOrderId")
	private List<FoodItem> foodItem=new ArrayList<>();
	
//	@Column(name="foodItem")
//	private FoodItem foodItem;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="foodOrderId")
	private OrderDetail orderEntity;

	
	
	public FoodOrder(){
		
	}
	
	
	public Long getFoodOrderId() {
		return foodOrderId;
	}


	public void setFoodOrderId(Long foodOrderId) {
		this.foodOrderId = foodOrderId;
	}


	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Date getOrderTime() {
		return orderTime;
	}



	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}



	public double getFoodPrice() {
		return foodPrice;
	}



	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public FoodOrder(Long customerId, int quantity, Date orderDate, Date orderTime, double foodPrice,
			List<FoodItem> foodItem, OrderDetail orderEntity) {
		super();
		this.customerId = customerId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.foodPrice = foodPrice;
		this.foodItem = foodItem;
		this.orderEntity = orderEntity;
	}


	public List<FoodItem> getFoodItem() {
		return foodItem;
	}


	public void setFoodItem(List<FoodItem> foodItem) {
		this.foodItem = foodItem;
	}


	public OrderDetail getOrderEntity() {
		return orderEntity;
	}



	public void setOrderEntity(OrderDetail orderEntity) {
		this.orderEntity = orderEntity;
	}




	


	@Override
	public String toString() {
		return "FoodOrder [foodOrderId=" + foodOrderId + ", customerId=" + customerId + ", quantity=" + quantity
				+ ", orderDate=" + orderDate + ", orderTime=" + orderTime + ", foodPrice=" + foodPrice + ", foodItem="
				+ foodItem + ", orderEntity=" + orderEntity + "]";
	}

}
