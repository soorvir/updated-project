package com.hexaware.onlinefooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.onlinefooddeliveryapp.entity.Customer;
import com.hexaware.onlinefooddeliveryapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(Long customerId) {
		
		return customerRepository.findById(customerId);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		 
		customerRepository.deleteById(customerId);
		
	}

	@Override
	public Optional<Customer> findByUsernameAndPassword(String username, String password) {
		return customerRepository.findByUsernameAndPassword(username,password);
	}

}




