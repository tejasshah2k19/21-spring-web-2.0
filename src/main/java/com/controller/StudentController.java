package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;
import com.bean.UserBean;

@Controller
public class StudentController {

	@GetMapping("/studentsignup")
	public String studentSignup(Model model) {
		model.addAttribute("student", new StudentBean());
		return "StudentSignup";
	}

	@PostMapping("/registerstudent")
	public String registerStudent(@ModelAttribute("student") @Valid StudentBean student, BindingResult result, Model model) {
		model.addAttribute("student", student);
		if (result.hasErrors()) { // true
			return "StudentSignup";
		} else {
			return "Home";
		}
	}
}
