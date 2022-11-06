package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.entity.Restraunt;


public interface IRestrauntService  {
	
	public List<Restraunt> getAllRestraunt();
	public Restraunt saveRestraunt(Restraunt restraunt);
	public Restraunt updateRestraunt(Restraunt restraunt)throws ResourceNotFoundException;
	public Optional<Restraunt> getRestrauntById(Long restrauntId);
	public void deleteRestrauntById(Long restrauntId);
	public List<Restraunt> getRestrauntByRestrauntName(String restrauntName);

}
