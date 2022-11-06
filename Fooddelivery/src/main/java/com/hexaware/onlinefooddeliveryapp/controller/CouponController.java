package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.onlinefooddeliveryapp.entity.Bill;
import com.hexaware.onlinefooddeliveryapp.entity.Coupon;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.ICouponService;

@CrossOrigin("*")
@RestController
@RequestMapping("/coupon")
public class CouponController {
	
	@Autowired
	private ICouponService couponService;
	
	@GetMapping("/listcoupon")
	public List<Coupon> getAllCoupon() {
		return couponService.getAllCoupon();
	}
	
	@PostMapping("/savecoupon")
	public Coupon saveCoupon(@RequestBody Coupon coupon) {
		return couponService.saveCoupon(coupon);
	}
	
	@GetMapping("/find/{coupon_id}")
	public Coupon getCouponById(@PathVariable("coupon_id") Long couponId) {
		return couponService.getCouponById(couponId).get();
	}
	
	@PutMapping("/updatecoupon/{coupon_id}")
	public Coupon updateCoupon(@RequestBody Coupon newCoupon,@PathVariable("coupon_id") Long couponId) throws ResourceNotFoundException {
		Coupon coupon =  couponService.getCouponById(couponId)
				.orElseThrow(() -> new ResourceNotFoundException("coupon not exists with id" +couponId));

		coupon.setCode(newCoupon.getCode());
		coupon.setExpireDate(newCoupon.getExpireDate());
		coupon.setGenerateDate(newCoupon.getGenerateDate());
		coupon.setValue(newCoupon.getValue());
		coupon.setCustomer(newCoupon.getCustomer());
		return couponService.updateCoupon(coupon);
		
	}
	
	@DeleteMapping("/deletecoupon/{coupon_id}")
	public void deleteCouponById(@PathVariable("coupon_id") Long couponId){
		 couponService.deleteCouponById(couponId);
	}
}
