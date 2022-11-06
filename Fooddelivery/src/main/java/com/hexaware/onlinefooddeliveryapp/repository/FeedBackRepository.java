package com.hexaware.onlinefooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack,Long> {
	
	
	
}
