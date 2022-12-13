package com.buddy.fullcrud.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.buddy.fullcrud.models.Recipe;

@Controller
public class RecipeController {
	
	
	@Autowired
	RecipeService recipeServ;

	// ---------- CREATE ----------------- THIS IS TO CREATE THE MANY(RECIPES, NINJAS ETC.//
	
	@GetMapping("/recipes/new")
	public String newRecipe(
		@ModelAttribute("recipeObj") Recipe emptyRecipe,
		HttpSession session
	) {
		// PLACE ON ALL ROUTE SEE NOTES IN FULLCRUDE
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "/recipes/new.jsp";
	}
	
	@PostMapping("/recipes/new")
	public String processRecipe(
		@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "/recipes/new.jsp";
		}
		Recipe newRecipe = recipeServ.create(filledRecipe);
		return "redirect:/recipes";
//		return "redirect:/recipes/" + newRecipe.getId();
	}
	// ---------- CREATE -----------------//
	
	
	
	// ----------- READ ALL ---------------//
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
	
	
	
}
