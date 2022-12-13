package com.buddy.bookclub.controllers;

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

import com.buddy.bookclub.models.Book;
import com.buddy.bookclub.models.LoginUser;
import com.buddy.bookclub.models.User;
import com.buddy.bookclub.services.BookService;
import com.buddy.bookclub.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userServ;
	
	@Autowired
	BookService bookServ;
	
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
		return "redirect:/books";
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
		return "redirect:/books";
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
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user_id", null);
		return "redirect:/";
	}

	
	// Books Route____________________________________________CREATE
	
	@GetMapping("/book/new")
	public String create(
		@ModelAttribute("bookObj") Book emptyBookObj
	) {
		return "/book/create.jsp";
	}
	
	@PostMapping("/book/new")
	public String createBook(
		@Valid @ModelAttribute("bookObj") Book filledBook,
		BindingResult results		
	) {
		if(results.hasErrors()) {
			return "/book/create.jsp";
		}
		// VALIDATIONS PASS
		bookServ.createBook(filledBook);
		return "redirect:/books";
		
		// THE CREATE METHOD RETURNS A NEW BOOK (OR WHATEVER YOU ARE COLLECT) YOU CAN THEN REDIRECT TO A SHOW PAGE USING
		// 
	}
	
	
	// BOOK READ ONE BOOK .... TIS USED TO GRAB ALL THE BOOKS
	
	@GetMapping("/books/{id}")
	public String showOneBook(
		@PathVariable("id") Long Id,
		Model model 
	) {
		Book oneBook = bookServ.getOneBook(Id);
		model.addAttribute("user", oneBook);		
		return "/book/show.jsp";
	}
	
	
	
	
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
		model.addAttribute("allBooks", bookServ.getAllBooks());
		return "/book/dashboard.jsp";
	}
	
	// Create a new book
	
	
	
	
	
	
	
}
