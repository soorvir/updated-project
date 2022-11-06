package com.hexaware.onlinefooddeliveryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.Restraunt;

@Repository
public interface RestrauntRepository extends JpaRepository<Restraunt, Long>{
	
	@Query
	public List<Restraunt> findByRestrauntName(String restrauntName);
	
}
