package com.buddy.daikichivariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Create a new controller called DaikichiController, 
//and be sure you annotate it as a @RestController



@RestController
public class TestController {
	
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
	
	
	
	@RequestMapping("/daikichi/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to kyoto " + city + "!";
	}

	@RequestMapping("/daikichi/lotto/{number}")
	public String travel2(@PathVariable("number") int number) {		
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";				
		}
	}
	


}
