package com.buddy.fullcrud.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.buddy.dojoninja.models.Dojo;
import com.buddy.fullcrud.services.MainService;

@Controller // THIS ANNOATIONS MUST BE ADDED AS THIS
public class FullCrudMainController {

	@Autowired
	MainService mainServ;	
	
	// ---------------- CREATING A DOJO -----------------//
	// WHEN CREATING A USER, DOJO ETC. YOU MUST HAVE TWO ROUTES. 
	// ONE THAT RENDERS THE TEMPLATE AND GETS THE INFO YOU ARE COLLECTING
	// THE SECOND ROUTE PROCESSES THE INFO YOU ARE COLLLECTIN.
	@GetMapping(value={"/", "/dojo/new"})
	public String createChef(
		@ModelAttribute("dojoObj")Dojo emptyDojo
	) {
		return "/dojo/create.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String processChef(
		@Valid @ModelAttribute("dojoObj")Dojo filledDojo,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "/dojo/create.jsp";
		}
		// VALIDATIONS PASS
		mainServ.createDojo(filledDojo);
		return "redirect:/";
	}
	
	
}
