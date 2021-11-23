package com.bean;

import org.hibernate.validator.constraints.NotBlank;

public class StudentBean {

	@NotBlank
	String firstName;

	@NotBlank
	String email;

	@NotBlank
	String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
