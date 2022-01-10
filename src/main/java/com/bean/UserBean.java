package com.bean;

import org.springframework.web.multipart.MultipartFile;

public class UserBean {

	int userId;
	String firstName, email, password;
	MultipartFile profile;
	String profilePath; 
	


	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}

	public MultipartFile getProfile() {
	return profile;
}

public void setProfile(MultipartFile profile) {
	this.profile = profile;
}

	public UserBean() {

		this.userId = (int) (Math.random() * 10000);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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
