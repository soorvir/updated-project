package com.hexaware.onlinefooddeliveryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.onlinefooddeliveryapp.entity.Bill;
import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.service.IBillService;


@CrossOrigin("*")
@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private IBillService billService;
	
	@GetMapping("/listbill")
	public List<Bill> getAllBill(){
		return billService.getAllBill();
	}
	
	@PostMapping("/savebill")
	public Bill saveBill(@RequestBody Bill billEntity) {
		return billService.saveBill(billEntity);
	}
	
	@PutMapping("/updatebill/{bill_id}")
	public Bill updateBill(@RequestBody Bill newBill,@PathVariable("bill_id") Long billId) throws ResourceNotFoundException {
		Bill bill =  billService.getBillById(billId)
				.orElseThrow(() -> new ResourceNotFoundException("bill not exists with id" +billId));

		bill.setCustomer(newBill.getCustomer());
		return billService.updateBill(bill);
		
	}
	
	@GetMapping("/findbill/{bill_id}")
	public Bill getBillById(@PathVariable("bill_id") Long billId){
		return billService.getBillById(billId).get();
	}
	
	@DeleteMapping("/deletebill/{bill_id}")
	public void deleteBillById(@PathVariable("bill_id") Long billId){
		 billService.deleteBillById(billId);
	}
}
