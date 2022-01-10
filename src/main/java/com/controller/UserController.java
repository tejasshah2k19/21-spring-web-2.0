package com.controller;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.CalcBean;
import com.bean.EmployeeBean;
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
		model.addAttribute("users", userDao.getAllUsers());
		return "ListUsers";
	}

	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam("userId") int userId) {
		userDao.deleteUser(userId);

		return "redirect:/listusers";// listusers url
	}

	@GetMapping("/viewuser")
	public String viewUser(@RequestParam("userId") int userId, Model model) {
		UserBean user = userDao.getUserById(userId);
		model.addAttribute("user", user);
		return "ViewUser";

	}

	@GetMapping("/edituser")
	public String editUser(@RequestParam("userId") int userId, Model model) {
		UserBean user = userDao.getUserById(userId);
		model.addAttribute("user", user);
		return "EditUser";
	}

	@PostMapping("/updateuser")
	public String updateUser(UserBean user) {

		userDao.updateUser(user);

		return "redirect:/listusers";
	}

	@GetMapping("/searchuser")
	public String searchUser() {
		return "SearchUser";
	}

	@GetMapping("/search")
	public String search(@RequestParam("firstName") String firstName, Model model) {

		ArrayList<UserBean> users = userDao.searchUserByFirstName(firstName);
		model.addAttribute("users", users);
		return "ListUsers";
	}

	@GetMapping("/newprofile2")
	public String newProfile2() {

		return "NewProfile2";
	}

	@GetMapping("/newprofile")
	public String newProfile() {

		return "NewProfile";
	}

	@PostMapping("/uploadprofile")
	public String uploadProfile(@RequestParam("profile") MultipartFile file) {

		System.out.println(file.getOriginalFilename());// 3.jpg

		try {

			File f = new File(
					"D:\\Tejas Shah\\Dropbox\\Tejas Shah's Workplace\\work\\21-spring-web-2.0\\src\\main\\webapp\\resources\\images\\",
					file.getOriginalFilename());
			f.createNewFile();//
			FileUtils.writeByteArrayToFile(f, file.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("file upload done");
		return "NewProfile";
	}

	@PostMapping("/uploadprofile2")
	public String uploadProfile2(UserBean user) {

		MultipartFile file = user.getProfile();
		System.out.println(file.getOriginalFilename());// 3.jpg

	
		user.setProfilePath("resources//images//"+user.getEmail()+"//"+file.getOriginalFilename());
		
		userDao.addUser(user);// insert

		try {

			File myDir = new File(
					"D:\\Tejas Shah\\Dropbox\\Tejas Shah's Workplace\\work\\21-spring-web-2.0\\src\\main\\webapp\\resources\\images\\"
							+ user.getEmail());
			myDir.mkdir(); // images\\tejas@gmail.com\\

			File f = new File(myDir, file.getOriginalFilename());
			f.createNewFile();//
			FileUtils.writeByteArrayToFile(f, file.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("file upload done");
		return "NewProfile";
	}

}
