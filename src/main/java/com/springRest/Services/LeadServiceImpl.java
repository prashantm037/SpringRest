package com.springRest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.Repository.LeadRepository;
import com.springRest.entity.Lead;

@Service
public class LeadServiceImpl implements LeadServcie {

	@Autowired
	private LeadRepository Leadrepo;
	
	@Override
	public void saveLead(Lead lead) {
		Leadrepo.save(lead);
	}

	@Override
	public List<Lead> getLeads() {
		List<Lead> lead = Leadrepo.findAll();
		return lead;
	}

	@Override
	public void deleteOnelead(long id) {
		Leadrepo.deleteById(id);
		
	}

	@Override
	public Lead findOneLead(long id) {
		Optional<Lead> findById = Leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	

}
