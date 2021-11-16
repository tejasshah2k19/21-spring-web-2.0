package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

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

	@GetMapping("/signup")
	public String signup() {
		return "Signup";
	}

	// http -> post
	@PostMapping("/saveuser")
	public String saveUser(UserBean user, Model model) {// get parameter
		// userBean
		// fr em pas --> getPAra
		// userBean.-->setter -> fr em pas

		System.out.println("save user call");
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		// request.set -->fn em pass
		// request dispatcher

		model.addAttribute("user", user);//set 

		return "PrintInfo";//rd 
	}
}
