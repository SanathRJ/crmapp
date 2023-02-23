package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.service.ContactService;

@Controller
public class ContactController {
@Autowired
private ContactService contactServ;

@RequestMapping("/listContact")
public String listContact(Model model) {
	List<Contact> contacts = contactServ.getAllContact();
	model.addAttribute("contacts", contacts);
	return "list_contacts";
}
}
