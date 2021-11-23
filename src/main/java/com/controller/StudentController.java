package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

@Controller
public class StudentController {

	@GetMapping("/studentsignup")
	public String studentSignup() {
		return "StudentSignup";
	}

	@PostMapping("/registerstudent")
	public String registerStudent(@Valid StudentBean student, BindingResult result) {

		if (result.hasErrors()) {
			return "StudentSignup";
		} else {
			return "Home";
		}
	}
}
