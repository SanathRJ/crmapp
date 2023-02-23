package com.zohocrmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.util.EmailService;


@Controller
public class EmailController {
	@Autowired
	private EmailService emailServ;
 @RequestMapping("/composeEmail")
 public String ComposeMail(@RequestParam("email") String email,Model model) {
	 model.addAttribute("email", email);
	 return "email_compose";
 }
 @RequestMapping("/sendEmail")
 public String mailSender(@RequestParam("to") String to, @RequestParam("sub") String sub,@RequestParam("msg") String msg, Model model) {
	 emailServ.sendEmail(to,sub,msg);
	 model.addAttribute("message","Email Sent");
	 return "email_compose";
 }
}
