package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.onlinefooddeliveryapp.entity.FeedBack;

import com.hexaware.onlinefooddeliveryapp.service.IFeedBackService;
@CrossOrigin("*")
@RestController
@RequestMapping("/feedback")
public class FeedBackController {
	
	@Autowired
	private IFeedBackService feedBackService;
	
	@GetMapping("/listfeedback")
	public List<FeedBack> getAllFeedback(){
		return feedBackService.getAllFeedback();
	}
	
	@PostMapping("/savefeedback")
	public FeedBack saveFeedback(@RequestBody FeedBack feedback) {
		return feedBackService.saveFeedback(feedback);
	}
}
