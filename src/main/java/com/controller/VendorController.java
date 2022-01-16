package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.VendorBean;
import com.dao.VendorDao;

@Controller
public class VendorController {

	@Autowired
	VendorDao vendorDao;

	// jsp open
	@GetMapping("/newvendor")
	public String newVendor() {
		return "NewVendor";
	}

	// save
	@PostMapping("/savevendor")
	public String saveVendor(VendorBean vendor) {
		vendorDao.insertVendor(vendor);
		return "Home";
	}

}
