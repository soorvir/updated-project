package com.hexaware.onlinefooddeliveryapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name ="order_detail")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long orderId;
		@Column(name = "product_quantity",nullable = false)
		private int productQuantity;
		@Column(name = "product_price",nullable = false)
		private int productPrice;
		@Column(name = "order_status",nullable = false)
		private String orderStatus;
//		@ManyToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name = "fk_customer_customer_id")
//		private Customer customer;
//		@Column(name="foodOrderId")
//		private Long foodOrderId;
		
		
		public OrderDetail() {
			
}

		public OrderDetail(int productQuantity, int productPrice, String orderStatus) {
			super();
			this.productQuantity = productQuantity;
			this.productPrice = productPrice;
			this.orderStatus = orderStatus;
		}
		
		
//		public Long getFoodOrderId() {
//			return foodOrderId;
//		}
//
//		public void setFoodOrderId(Long foodOrderId) {
//			this.foodOrderId = foodOrderId;
//		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public int getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		
		
//		public OrderDetail(int productQuantity, int productPrice, String orderStatus, Long foodOrderId) {
//			super();
//			this.productQuantity = productQuantity;
//			this.productPrice = productPrice;
//			this.orderStatus = orderStatus;
//			this.foodOrderId = foodOrderId;
//		}

		
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", productQuantity=" + productQuantity + ", productPrice="
					+ productPrice + ", orderStatus=" + orderStatus + "]";
		}


}
