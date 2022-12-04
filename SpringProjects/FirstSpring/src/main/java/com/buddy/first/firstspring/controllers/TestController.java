package com.buddy.first.firstspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This Annotaions is telling the compiler this method is a Controller
@RestController
public class TestController {
	
	
// This Annotaions is telling the compiler this method is a Route. Also this is defining a route.
		@RequestMapping("/")
		public String index() {
			return "Hello World";
		}

		@RequestMapping("/welcome")
		public String welcome() {
			return "Welcome Home";
		}
		
// Everything that comes through the URL comes through as a string. (At this time)
// even if the variable is a number it stills get pass through as a string. 
// Using the PathVariable what goes inside must match the variable to use in the route. 
		@RequestMapping("/recipes/{id}")
		public String oneRecipe(@PathVariable("id") String id) {
			return "One Recipe Page " + id; 
		}
}
