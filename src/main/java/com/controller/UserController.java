package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/home")
	public String home() {

		return "Home";
	}
	
	
	@GetMapping("/calc")
	public String calc() {
		return "Calc";
	}
}
