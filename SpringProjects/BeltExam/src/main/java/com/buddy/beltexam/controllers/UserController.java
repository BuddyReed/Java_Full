package com.buddy.beltexam.controllers;

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

import com.buddy.beltexam.models.Baby;
import com.buddy.beltexam.models.LoginUser;
import com.buddy.beltexam.models.User;
import com.buddy.beltexam.services.BabyService;
import com.buddy.beltexam.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userServ;
	
	@Autowired
	BabyService babyServ;
	
	
	@GetMapping("/")
	public String index(
		@ModelAttribute("newUser") User emptyUser,
		@ModelAttribute("newLogin") LoginUser emptyLoginUser
	) {
		return "/user/index.jsp";
	}
	
	
	
	// PROCESS REGISTER
	@PostMapping("/register")
	public String register(
		@Valid @ModelAttribute("newUser") User filledUser,
		BindingResult results,
		HttpSession session,
		Model model
	) {
		User createdUser = userServ.register(filledUser, results);
		if(results.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "/user/index.jsp";
		}
		// SAVE THE USERS ID IN SESSION
		session.setAttribute("user_id", createdUser.getId());
		return "redirect:/babys";
	}
	
	// PROCESS LOGIN
	@PostMapping("/login")
	public String login(
		@Valid @ModelAttribute("newLogin") LoginUser filledLoginUser,
		BindingResult results,
		HttpSession session,
		Model model
	) {
		User loggedUser = userServ.login(filledLoginUser, results);
		if(results.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "/user/index.jsp";
		}
		session.setAttribute("user_id", loggedUser.getId()); 
		return "redirect:/babys";
	}
	
	// THIS ROUTE ALLOWS YOU TO DISPLAY USERS NAME AS WELL.
	
//	@GetMapping("/homepage")
//	public String homepage(
//		HttpSession session,
//		Model model // VIEW MODEL ANY INFO FROM CONTROLLER TO JSP
//	) {		
//		Long userId = (Long) session.getAttribute("user_id");// WE ARE CASTING TO LONG BECAUSE WE NEED TO CHANGE FROM A OBJECT
//		if(session.getAttribute("user_id") == null) {
//			return "redirect:/";
//		}
//		model.addAttribute("oneUser", userServ.getOneUser(userId));
//		return "dashboard.jsp";
//		
//	}
	
//	@GetMapping("/logout")
//	public String logout(HttpSession session) {
//		session.setAttribute("user_id", null);
//		return "redirect:/";
//	}
	
	// LOGOUT this is the way ED did it try it
	@GetMapping("/logout")
	public String logout(
		HttpSession session
	) {
		session.invalidate();
//		session.removeAttribute("user_id");
		return "redirect:/";
	}

	
	
	
	// RED BELT 
	
	// SHOW ALL BABYS_______ RED ALL____
	
	@GetMapping("/babys")
	public String showAll(
	HttpSession session, Model model 
	) {		
		Long userId = (Long) session.getAttribute("user_id");// WE ARE CASTING TO LONG BECAUSE WE NEED TO CHANGE FROM A OBJECT
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// THIS ALLOW USE TO SHOW THE USER NAME ON THE PAGE
		model.addAttribute("oneUser", userServ.getOneUser(userId));
		model.addAttribute("allBabys", babyServ.getAllBabys());
		return "/baby/dashboard.jsp";
	}	
	
	// ---------- CREATE ----------------- THIS IS TO CREATE THE MANY(RECIPES, NINJAS ETC.//
	
	@GetMapping("/babys/new")
	public String newBaby(
		@ModelAttribute("babyObj") Baby emptyBaby,
		HttpSession session
	) {
		// PLACE ON ALL ROUTE SEE NOTES IN FULLCRUDE
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "/baby/new.jsp";
	}
	
	@PostMapping("/babys/new")
	public String processBaby(
		@Valid @ModelAttribute("babyObj") Baby filledBaby,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "/baby/new.jsp";
		}
		babyServ.createBaby(filledBaby);
		return "redirect:/babys";
	}
	// ---------- CREATE ------------------------------------------------------------------------//
	
	
	
	// ---------- READ ONE --------------//
	@GetMapping("/babys/{id}")
	public String oneBaby(
		@PathVariable("id") Long id,
		Model model, HttpSession session
	) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("oneBaby", babyServ.getOneBaby(id) );
		return "/baby/show.jsp";
	}
	// ---------- READ ONE --------------//
	
	
	// ---------- UPDATE --------------//
	@GetMapping("/babys/{id}/edit")
	public String edit(
		@PathVariable("id") Long id,
		Model model, HttpSession session
	) {
		// Gets the creator id and compar against id in session
		if(session.getAttribute("user_id") == null) {
		return "redirect:/babys";
	}
		model.addAttribute("babyObj", babyServ.getOneBaby(id));
		return "/baby/edit.jsp";
	}
	@PutMapping("/babys/{id}/edit")
	public String update(
		@Valid @ModelAttribute("babyObj") Baby filledBaby,
		BindingResult results
	) {
		if(results.hasErrors()) {
			return "/baby/edit.jsp";
		}
		babyServ.createBaby(filledBaby);
		return "redirect:/babys";
	}
	// ---------- UPDATE --------------//
	
	
	// ---------- DELETE --------------//
	@GetMapping("/babys/{id}/delete")
	public String delete(
		@PathVariable("id") Long id
	) {
		babyServ.deleteBaby(id);
		return "redirect:/babys";
	}
	
	
	
	
	
	
}
