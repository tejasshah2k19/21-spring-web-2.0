package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;
import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;

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

		// dao --> insert
		userDao.addUser(user);
		model.addAttribute("user", user);// set

		return "PrintInfo";// rd
	}

	@PostMapping("/addition")
	public String addition(CalcBean calc, Model model) {

		if (calc.getChoice().equals("add"))
			model.addAttribute("ans", calc.getN1() + calc.getN2());
		else if (calc.getChoice().equals("sub"))
			model.addAttribute("ans", calc.getN1() - calc.getN2());
		else if (calc.getChoice().equals("mul"))
			model.addAttribute("ans", calc.getN1() * calc.getN2());
		else
			model.addAttribute("ans", calc.getN1() + calc.getN2());

		return "Ans";
	}

	@GetMapping("/listusers")
	public String listUsers(Model model) {
		model.addAttribute("users",userDao.getAllUsers());
		return "ListUsers";
	}
	
	
}
