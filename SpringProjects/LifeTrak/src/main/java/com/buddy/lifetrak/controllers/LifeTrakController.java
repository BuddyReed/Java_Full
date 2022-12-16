package com.buddy.lifetrak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.buddy.lifetrak.services.UserService;

@Controller
public class LifeTrakController {

	@Autowired
	UserService userServ;
	
	@GetMapping("/")
	public String index() {
		return "/lifetrak/home.jsp";
	}
	
	@GetMapping("/alltask")
	public String allTask() {
		return "/lifetrak/alltask.jsp";
	}
	

	
}
