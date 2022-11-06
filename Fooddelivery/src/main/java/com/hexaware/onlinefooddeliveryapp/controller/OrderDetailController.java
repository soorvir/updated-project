package com.hexaware.onlinefooddeliveryapp.controller;

import org.springframework.web.bind.annotation.RestController;


import com.hexaware.onlinefooddeliveryapp.entity.OrderDetail;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IOrderDetailService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/order")
public class OrderDetailController {

	@Autowired
	private IOrderDetailService orderService;
	@GetMapping("/listorder")
	public List<OrderDetail> getAllOrders(){
		return orderService.getAllOrders();
	}
	@PostMapping("/saveorder")
	public OrderDetail saveOrder(@RequestBody OrderDetail order) {
		return orderService.saveOrder(order);
	}
	@PutMapping("/updateorder/{oid}")
	public OrderDetail updateOrder(@RequestBody OrderDetail newOrder,@PathVariable("oid") Long orderId) throws ResourceNotFoundException{
	  OrderDetail orderDetail = orderService.getOrderById(orderId).orElseThrow(() -> new ResourceNotFoundException("order not exists with Id" + orderId));
	 
	  orderDetail.setProductQuantity(newOrder.getProductQuantity());
	  orderDetail.setProductPrice(newOrder.getProductPrice());
	  orderDetail.setOrderStatus(newOrder.getOrderStatus());
		return orderService.updateOrder(orderDetail);
    }
	@GetMapping("/findorder/{oid}")
	public OrderDetail getOrderById(@PathVariable("oid") Long orderId){
		return orderService.getOrderById(orderId).get();
	}
	@DeleteMapping("/deleteorder/{oid}")
	public void deleteOrderById(@PathVariable("oid") Long orderId){
		orderService.deleteOrderById(orderId);
	}
}
