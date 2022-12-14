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
		recipeServ.create(filledRecipe);
		return "redirect:/recipes";
	}
	// ---------- CREATE ------------------------------------------------------------------------//
	
	
	
	// ----------- READ ALL ---------------//
	@GetMapping("/recipes")
	public String index(
		HttpSession session, Model model
	) {
//		if(session.getAttribute("user_id") == null) {
//			return "redirect:/";
//		}
		model.addAttribute("allRecipes", recipeServ.getAll());
		return "/recipes/index.jsp";
	}
	
	
	// ---------- READ ONE --------------//
	@GetMapping("/recipes/{id}")
	public String oneRecipe(
		@PathVariable("id") Long id,
		Model model, HttpSession session
	) {
//		if(session.getAttribute("user_id") == null) {
//			return "redirect:/";
//		}
		model.addAttribute("oneRecipe", recipeServ.getOne(id) );
		return "/recipes/show.jsp";
	}
	// ---------- READ ONE --------------//
	
	
	
	// ---------- UPDATE --------------//
	@GetMapping("/recipes/{id}/edit")
	public String edit(
		@PathVariable("id") Long id,
		Model model
	) {
//		if(session.getAttribute("user_id") == null) {
//		return "redirect:/";
//	}
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
	
	
	
	// EXTRA
	
	// READ ALLL WITH USER NAME
	
	// This displays all (READ ALL) books and the user who is signed in...
	@GetMapping("/books")
	public String showAll(
	HttpSession session, Model model 
	) {		
		Long userId = (Long) session.getAttribute("user_id");// WE ARE CASTING TO LONG BECAUSE WE NEED TO CHANGE FROM A OBJECT
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// THIS ALLOW USE TO SHOW THE USER NAME ON THE PAGE
		model.addAttribute("oneUser", userServ.getOneUser(userId));
		model.addAttribute("allBooks", bookServ.getAllBooks());
		return "/book/dashboard.jsp";
	}
	
	
	
	
	
	
}
