package com.hexaware.onlinefooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.PlaceOrder;

@Repository
public interface PlaceOrderRepository extends JpaRepository<PlaceOrder,Long> {

}
