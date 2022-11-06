package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.FeedBack;
import com.hexaware.onlinefooddeliveryapp.repository.FeedBackRepository;

@Service
public class FeedBackServiceImpl implements IFeedBackService{
	
	@Autowired
	private FeedBackRepository feedBackRepository;
	
	@Override
	public List<FeedBack> getAllFeedback() {
		// TODO Auto-generated method stub
		return feedBackRepository.findAll();
	}

	@Override
	public FeedBack saveFeedback(FeedBack feedback) {
		// TODO Auto-generated method stub
		return feedBackRepository.save(feedback);
	}
	
	
	
}
