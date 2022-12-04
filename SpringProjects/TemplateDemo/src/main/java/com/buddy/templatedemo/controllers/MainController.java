package com.buddy.templatedemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		// RETRIEVE ALL USERS
		ArrayList<String> userList = new ArrayList<String>();
		
		userList.add("Edward Im");
		userList.add("Jane Doe");
		userList.add("John Doe");
		
		model.addAttribute("allUsers", userList);
		return "index.jsp";
	}
	
	@GetMapping("/user")
	public String oneUser(Model model) {
		
		model.addAttribute("fullName", "Edward Im");
		model.addAttribute("lastName", "Reed");
		model.addAttribute("age", 32);
		model.addAttribute("check", true);
		return "user.jsp";
	}
	
	@GetMapping("/play/{number}")
	public String playground(@PathVariable("number") String number, Model model) {
		model.addAttribute("times", number);
		return "playground.jsp";
	}

}
