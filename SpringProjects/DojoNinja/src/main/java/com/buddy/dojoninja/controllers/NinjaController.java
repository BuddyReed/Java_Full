package com.buddy.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.buddy.dojoninja.models.Ninja;
import com.buddy.dojoninja.services.MainService;

@Controller 
public class NinjaController {
	
	@Autowired
	MainService mainServ;	

	
	// ---------------- CREATING A DISH -----------------//
	@GetMapping("/ninja/new")
	public String createNinja(
		@ModelAttribute("ninjaObj") Ninja emptyNinjaObj,
		Model model
	) {
		model.addAttribute("allDojos", mainServ.getAllDojos());
		return "/ninja/create.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String processNinja(
		@Valid @ModelAttribute("ninjaObj")Ninja filledNinja,
		BindingResult results,
		Model model
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			model.addAttribute("allDojos", mainServ.getAllDojos());
			return "/ninja/create.jsp";
		}
		// VALIDATIONS PASS
		mainServ.createNinja(filledNinja);
		return "redirect:/ninja/new";
	}	
}
