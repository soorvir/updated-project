package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Restraunt;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.repository.RestrauntRepository;

@Service
public class RestrauntServiceImpl implements IRestrauntService {
	
	@Autowired
	private RestrauntRepository restrauntRepository;

	@Override
	public List<Restraunt> getAllRestraunt() {
		return restrauntRepository.findAll();
	}

	@Override
	public Restraunt saveRestraunt(Restraunt restraunt) {
		return restrauntRepository.save(restraunt);
	}

	@Override
	public Optional<Restraunt> getRestrauntById(Long restrauntId) {
		
		return restrauntRepository.findById(restrauntId);
	}

	@Override
	public void deleteRestrauntById(Long restrauntId) {
		restrauntRepository.deleteById(restrauntId);
	}

	@Override
	public Restraunt updateRestraunt(Restraunt restraunt) throws ResourceNotFoundException {
		return restrauntRepository.save(restraunt);
	}

	@Override
	public List<Restraunt> getRestrauntByRestrauntName(String restrauntName) {
		// TODO Auto-generated method stub
		return restrauntRepository.findByRestrauntName(restrauntName);
	}
}
