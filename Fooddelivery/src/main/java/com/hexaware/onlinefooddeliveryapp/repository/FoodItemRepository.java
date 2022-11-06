package com.hexaware.onlinefooddeliveryapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.hexaware.onlinefooddeliveryapp.entity.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem,Long>{

	List<FoodItem> findByFoodItemName(String foodItemName);

}
