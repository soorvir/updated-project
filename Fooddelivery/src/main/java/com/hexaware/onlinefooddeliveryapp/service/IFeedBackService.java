package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;

import com.hexaware.onlinefooddeliveryapp.entity.FeedBack;

public interface IFeedBackService {

	public List<FeedBack> getAllFeedback();

	public FeedBack saveFeedback(FeedBack feedback);
	
	

}
