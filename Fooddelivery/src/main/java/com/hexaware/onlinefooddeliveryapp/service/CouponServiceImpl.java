package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Coupon;
import com.hexaware.onlinefooddeliveryapp.repository.CouponRepository;

@Service
public class CouponServiceImpl implements ICouponService {
	
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public List<Coupon> getAllCoupon() {
		return couponRepository.findAll();
	}

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		
		return couponRepository.save(coupon);
	}

	@Override
	public Optional<Coupon> getCouponById(Long coupon) {
		
		return couponRepository.findById(coupon);
	}

	@Override
	public Coupon updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponRepository.save(coupon);
	}

	@Override
	public void deleteCouponById(Long couponId) {
		couponRepository.deleteById(couponId);
		
	}
}
