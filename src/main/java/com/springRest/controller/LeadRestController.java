package com.springRest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.Services.LeadServcie;
import com.springRest.entity.Lead;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	@Autowired
	private LeadServcie leadservice;
	
	@GetMapping
	public List<Lead> getAllLead(){
		List<Lead> leads = leadservice.getLeads();
		return leads;
	}

	@PostMapping
	public void saveLead(@RequestBody Lead lead) {
		leadservice.saveLead(lead);
	}
	@PutMapping
	public void updateLead(@RequestBody Lead lead) {
		leadservice.saveLead(lead);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLead(@PathVariable("id") long id) {
		leadservice.deleteOnelead(id);
	}
}
