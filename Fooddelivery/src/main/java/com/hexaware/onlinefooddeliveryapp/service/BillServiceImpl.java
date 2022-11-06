package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Bill;
import com.hexaware.onlinefooddeliveryapp.repository.BillRepository;

@Service
public class BillServiceImpl implements IBillService{
	
	@Autowired
	private BillRepository billRepository;

	@Override
	public List<Bill> getAllBill() {
		
		return billRepository.findAll();
	}

	@Override
	public Bill saveBill(Bill billEntity) {
		// TODO Auto-generated method stub
		return billRepository.save(billEntity);
	}

	@Override
	public Optional<Bill> getBillById(Long billId) {
		// TODO Auto-generated method stub
		return billRepository.findById(billId);
	}

	@Override
	public void deleteBillById(Long billId) {
		
		billRepository.deleteById(billId);
		
	}

	@Override
	public Bill updateBill(Bill billEntity) {
		// TODO Auto-generated method stub
		return billRepository.save(billEntity);
	}

}
