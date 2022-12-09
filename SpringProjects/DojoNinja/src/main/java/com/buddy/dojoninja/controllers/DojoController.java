package com.buddy.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.buddy.dojoninja.models.Dojo;
import com.buddy.dojoninja.services.MainService;

@Controller 
public class DojoController {

	
	@Autowired
	MainService mainServ;	
	
	// ---------------- CREATING A DOJO -----------------//
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
	
	
	
	// ---------------- DISPLAY ONE CHEF -----------------//
	@GetMapping("/dojos/{id}")
	public String oneDojo(
		@PathVariable("id") Long dojoId,
		Model model
	) {
		Dojo oneDojo = mainServ.getOneDojo(dojoId);
		model.addAttribute("dojo", oneDojo);
		return "/dojo/display.jsp";
	}
	
	
}
