package com.springRest.Services;

import java.util.List;

import com.springRest.entity.Lead;

public interface LeadServcie {
	
	public void saveLead(Lead lead);

	public List<Lead> getLeads();

	public void deleteOnelead(long id);

	public Lead findOneLead(long id);


}
