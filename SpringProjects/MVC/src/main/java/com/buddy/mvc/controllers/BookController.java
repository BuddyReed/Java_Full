package com.buddy.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.buddy.mvc.services.BookService;

@Controller 
public class BookController {

	@Autowired
	BookService bookServe;
	
	@GetMapping("/books/{id}")
	public String showOneBook(
		@PathVariable("id") Long id	
		){
		return "show.jsp";
	}
	
	@PostMapping("/getbook"){
	
	}
	
}
