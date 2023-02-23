package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.service.BillingService;
import com.zohocrmapp.service.ContactService;

@Controller
public class BillingController {
@Autowired
private BillingService billServ;
@Autowired
private ContactService contactServ;

@RequestMapping("/createBill")
public String createBill(@RequestParam("id") long id,Model model) {
	Contact contact = contactServ.findContactById(id);
	model.addAttribute("contact",contact);
	return "generate_bill";
}
@RequestMapping("/generateBill")
public String generateBills(Billing bill,Model model) {
	billServ.saveBill(bill);
	List<Billing> bills = billServ.getAllBills();
	model.addAttribute("bills",bills);
	return "listBills";
}
@RequestMapping("/listBills")
public String listBills(Model model) {
	List<Billing> bills = billServ.getAllBills();
	model.addAttribute("bills", bills);
	return "listBills";
}
}
