package com.buddy.fullcrud.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.buddy.dojoninja.models.Dojo;
import com.buddy.fullcrud.models.Recipe;
import com.buddy.fullcrud.services.MainService;

@Controller // THIS ANNOATIONS MUST BE ADDED AS THIS
public class FullCrudMainController {

	
	@Autowired // THIS ANNOATIONS INSTANATE THE SERVICE INTO THE CONTROLLER
	MainService mainServ;	
	
	// ---------------- CREATING A DOJO -----------------//
	// WHEN CREATING A USER, DOJO ETC. YOU MUST HAVE TWO ROUTES. 
	// ONE THAT RENDERS THE TEMPLATE AND GETS THE INFO YOU ARE COLLECTING
	// THE SECOND ROUTE PROCESSES THE INFO YOU ARE COLLLECTIN.
	@GetMapping(value={"/", "/dojo/new"})
	public String createChef(
		@ModelAttribute("dojoObj")Dojo emptyDojo // THIS CREATES A EMPTY OBJECT AND THE VARIABLE WITHIN THE PERTHENSIS SHOULD BE IN THE MODEL ATTRIBUTE ON THE FORM
		HttpSession session 
	) {
		// THIS LOGIC BELOW MAKES USER HAVE TO BE LOGGED IN, IN ORED TO ACCESS THIS PAGE
		// YOU WANT TO BE SURE TO ADD THIS LOGIC TO ANY ROUTE YOU DON'T WANT A USER TO NOT
		// HAVE ACCESS TO WITHOUT BEING LOGGED IN. 
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
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
//		Dojo newDojo = mainServ.createDojo(filledDojo); THIS LINE CAN BE WRITTEN LIKE LINE ABOT OR LIKE THIS LINE
		return "redirect:/";
//		return "redirect:/recipes/" + newRecipe.getId(); THIS  ALLOWS YOU TO GO TO THE PAGE OF THE NEW RECIPE (MANY) THAT WAS JUST CREATEED
	}
	
	
	
	
	
	// ----------- READ ALL ---------------//
	// THIS ROUTE SHOWS ALL THE RECIPES (MANY) ON THE PAGE.
	@GetMapping("/recipes")
	public String index(
		HttpSession session, Model model
	) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("allRecipes", recipeServ.getAll());
		return "/recipes/index.jsp";
	}
	
	// ---------- READ ONE --------------//
	// THIS GRABS ONE RECIPE (MANY) TO DISPLAY
	@GetMapping("/recipes/{id}")
	public String oneRecipe(
		@PathVariable("id") Long id,
		Model model
	) {
		model.addAttribute("oneRecipe", recipeServ.getOne(id) );
		return "/recipes/show.jsp";
	}
	// ---------- READ ONE --------------//
	
	
	// ---------- UPDATE --------------//
	// THE UPDATE/EDIT MIRROR THE CREATE AS WE ARE UPDATING
	// THE ITEM WE'VE CREATED
	@GetMapping("/recipes/{id}/edit")
	public String edit(
		@PathVariable("id") Long id,
		Model model
	) {
		model.addAttribute("recipeObj", recipeServ.getOne(id));
		return "/recipes/edit.jsp";
	}
	@PutMapping("/recipes/{id}/edit")
	public String update(
		@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
		BindingResult results
	) {
		if(results.hasErrors()) {
			return "/recipes/edit.jsp";
		}
		recipeServ.create(filledRecipe);
		return "redirect:/recipes";
	}
	// ---------- UPDATE --------------//
	
	
	// ---------- DELETE --------------//
	@GetMapping("/recipes/{id}/delete")
	public String delete(
		@PathVariable("id") Long id
	) {
		recipeServ.deleteOne(id);
		return "redirect:/recipes";
	}
	
	
}
