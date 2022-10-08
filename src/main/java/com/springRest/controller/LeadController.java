package com.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springRest.Services.LeadServcie;
import com.springRest.entity.Lead;
import com.springRest.utility.EmailServcie;

@Controller
public class LeadController {
	@Autowired
	private LeadServcie leadservice;
	
	@Autowired
	private EmailServcie emailservice;
	
	@RequestMapping("/ViewLead")
	public String viewLeadPage() {
		return "Create_Lead";
	}
	
	@RequestMapping("/SaveLead")
	public String SaveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadservice.saveLead(lead);
		emailservice.SendEmail(lead.getEmail(), "welcome", "TC palya");
		model.addAttribute("msg", "Lead is Saved");
		return "Create_Lead";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		List<Lead> lead=leadservice.getLeads();
		model.addAttribute("lead", lead);
		return "lead_Search_result";
	}
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") long id,ModelMap model ) {
		leadservice.deleteOnelead(id);
		List<Lead> lead=leadservice.getLeads();
		model.addAttribute("lead", lead);
		return "lead_Search_result";
	}
	
	@RequestMapping("/update")
	public String updateLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead=leadservice.findOneLead(id);
		model.addAttribute("lead", lead);
		return "update_Lead";
	}
	
	@RequestMapping("/updateLead")
	public String updateLead(@ModelAttribute("leads") Lead leads,ModelMap  model) {
		leadservice.saveLead(leads);
		model.addAttribute("msg", "Lead with Id:"+leads.getId()+"is Updated");
		List<Lead> lead=leadservice.getLeads();
		model.addAttribute("lead", lead);
		return "lead_Search_result";
	}
}
