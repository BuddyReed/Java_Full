package com.buddy.omikuijform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/login")
	public String login(
			@RequestParam ("number") int number,
			@RequestParam ("city") String city,
			@RequestParam ("person") String person,
			@RequestParam ("hobby") String hobby, 
			@RequestParam ("animal") String animal,
			@RequestParam ("message") String message,
			HttpSession session) {
			session.setAttribute("sessionNum", number);
			session.setAttribute("sessionCity", city);
			session.setAttribute("sessionPerson", person);
			session.setAttribute("sessionHobby", hobby);
			session.setAttribute("sessionanimal", animal);
			session.setAttribute("sessionMessage", message);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String show() {
		return "show.jsp";
	}
	
}
