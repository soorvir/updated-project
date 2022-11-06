package com.hexaware.onlinefooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Long>{

}
