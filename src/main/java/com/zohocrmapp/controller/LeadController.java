package com.zohocrmapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.service.ContactService;
import com.zohocrmapp.service.LeadService;



@Controller
public class LeadController {
@Autowired
private LeadService leadServ;
@Autowired
private ContactService contactServ;
	@RequestMapping("/create")
	public String createLead() {
		
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(Lead lead,Model model) {
		leadServ.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertContact")
	public String ContactLead(@RequestParam("id") long id,Model model) {
	Lead lead = leadServ.findLeadById(id);
	Contact contact = new Contact();
			contact.setEmail(lead.getEmail());
	contact.setFirstName(lead.getFirstName());
	contact.setLastName(lead.getLastName());
	contact.setMobile(lead.getMobile());
	contact.setSource(lead.getSource());
	leadServ.deleteLeadByid(id);
	contactServ.saveContact(contact);
	List<Contact> contacts = contactServ.getAllContact();
	model.addAttribute("contacts",contacts);
		return "list_contacts";
	}
	@RequestMapping("/listLeads")
	public String listLeads(Model model) {
		List<Lead> leads = leadServ.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/leadInfo")
	public String LeadInfo(@RequestParam("id")long id,Model model) {
		Lead lead = leadServ.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
}
