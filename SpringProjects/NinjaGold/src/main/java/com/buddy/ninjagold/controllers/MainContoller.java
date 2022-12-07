package com.buddy.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class MainContoller {
	
	@GetMapping("/")
		public String index(
		@RequestParam ("count") int 
		@RequestParam
		@RequestParam
		@RequestParam
				) {
			return "index.jsp";
		}

	@PostMapping("/money")
	public String money() {
		return "redirect:/";
	}
}
