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

import com.hexaware.onlinefooddeliveryapp.exception.ResourceNotFoundException;
import com.hexaware.onlinefooddeliveryapp.entity.Restraunt;
import com.hexaware.onlinefooddeliveryapp.service.IRestrauntService;

@CrossOrigin("*")
@RestController
@RequestMapping("/restraunt")
public class RestrauntController {
	
	@Autowired
	private IRestrauntService restrauntService;
	
	@GetMapping("/listsrestraunt")
	public List<Restraunt> getAllRestraunt(){
		return restrauntService.getAllRestraunt();
	}
	
	@PostMapping("/savesrestraunt")
	public Restraunt saveRestraunt(@RequestBody Restraunt restraunt) {
		return restrauntService.saveRestraunt(restraunt);
	}
	
	@PutMapping("/updateRestraunt/{sid}")
	public Restraunt updateRestraunt(@RequestBody Restraunt newRestraunt,@PathVariable("rid")Long restrauntId) throws ResourceNotFoundException {
		Restraunt res=restrauntService.getRestrauntById(restrauntId)
				.orElseThrow(() -> new ResourceNotFoundException("Restraunt does not exists with the given Restraunt Id" +restrauntId));
		res.setOwnerFirstName(newRestraunt.getOwnerFirstName());
		res.setOwnerMiddleName(newRestraunt.getOwnerMiddleName());
		res.setOwnerLastName(newRestraunt.getOwnerLastName());
		res.setRestrauntPhoneNumber(newRestraunt.getRestrauntPhoneNumber());
		res.setRestrauntEmail(newRestraunt.getRestrauntEmail());
		res.setRestrauntStreet(newRestraunt.getRestrauntStreet());
		res.setRestrauntCity(newRestraunt.getRestrauntCity());
		res.setRestrauntCountry(newRestraunt.getRestrauntCountry());
		res.setRestrauntName(newRestraunt.getRestrauntName());
		res.setUsername(newRestraunt.getUsername());
		res.setPassword(newRestraunt.getPassword());
		return restrauntService.updateRestraunt(res);
	}
	
	
	@GetMapping("/findrestraunt/{rid}")
	public Restraunt getRestrauntById(@PathVariable("rid")Long restrauntId) {
		return restrauntService.getRestrauntById(restrauntId).get();
	}
	
	@DeleteMapping("/deleteRestraunt/{rid}")
	public void deleteRestrauntById(@PathVariable("rid")Long restrauntId) {
		restrauntService.deleteRestrauntById(restrauntId);
	}
	
	@GetMapping("/findrestrauntbyname/{restrauntname}")
	public List<Restraunt> getRestrauntByRestrauntName(@PathVariable("restrauntname") String restrauntName) {
		return restrauntService.getRestrauntByRestrauntName(restrauntName);
	}
	
}
