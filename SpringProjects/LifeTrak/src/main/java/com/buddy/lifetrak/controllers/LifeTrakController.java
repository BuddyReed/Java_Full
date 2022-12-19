package com.buddy.lifetrak.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping("/dashboard")
	public String dashboard(
	HttpSession session, Model model 
	) {
		Long userId = (Long) session.getAttribute("user_id");// WE ARE CASTING TO LONG BECAUSE WE NEED TO CHANGE FROM A OBJECT
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// THIS ALLOW USE TO SHOW THE USER NAME ON THE PAGE
		model.addAttribute("oneUser", userServ.getOneUser(userId));
		return "/lifetrak/dashboard.jsp";
	}
	
	
	@GetMapping("/alltask")
	public String allTask() {
		return "/lifetrak/alltask.jsp";
	}
	
	

	
}
