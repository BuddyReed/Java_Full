package com.buddy.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Create a new controller called DaikichiController, 
//and be sure you annotate it as a @RestController



@RestController
public class TestControllers {
	
//	Have an http GET request to 'http://localhost:8080/daikichi' 
//	display text that says 'Welcome!'
	@RequestMapping(value="/daikichi", method=RequestMethod.GET)
	public String index() {
		return "Welcome!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/today' 
//	display text that says 'Today you will find luck in all your endeavors!'
	
	@RequestMapping("/daikichi/today")
	public String fortune() {
		return "'Today you will find luck in all your endeavors!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/tomorrow'
//	display text that says 'Tomorrow, an opportunity will arise, so be 
//	sure to be open to new ideas!'
	
	@RequestMapping("/daikichi/tomorrow")
	public String fortune2() {
		return "'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}


}
