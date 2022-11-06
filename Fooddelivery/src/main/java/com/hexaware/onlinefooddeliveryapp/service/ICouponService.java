package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.entity.Coupon;

public interface ICouponService {

	public List<Coupon> getAllCoupon();

	public Coupon saveCoupon(Coupon coupon);

	public Optional<Coupon> getCouponById(Long coupon);

	public Coupon updateCoupon(Coupon coupon);

	public void deleteCouponById(Long couponId);

	
		

}
