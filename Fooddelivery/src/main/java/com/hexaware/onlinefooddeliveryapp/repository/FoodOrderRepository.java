package com.hexaware.onlinefooddeliveryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.Customer;
import com.hexaware.onlinefooddeliveryapp.entity.FoodOrder;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long> {
	
//	@Query("select new com.hexaware.onlinefooddeliveryapp.entity.FoodOrder(food_price) from food_order f where f.filterCol = ?1")
//	List<Integer> getFoodOrderPriceById(Long customerId);
//	
	

}
