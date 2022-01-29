package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	// list vendors

	@GetMapping("/listvendor")
	public String listVendor(Model model) {

		List<VendorBean> vendors = vendorDao.getAllVendors();
		model.addAttribute("vendors", vendors);

		return "ListVendors";
	}

	@GetMapping("/deletevendor")
	public String deleteVendor(@RequestParam("vendorId") int vendorId) {

		vendorDao.deleteVendor(vendorId);

		return "redirect:/listvendor";// this will not open jsp this will redirect you to another url
	}

	@GetMapping("/editvendor")
	public String editVendor(@RequestParam("vendorId") int vendorId, Model model) {

		VendorBean vendorBean = vendorDao.getVendorById(vendorId);
		model.addAttribute("vendor", vendorBean);

		return "EditVendor";
	}

	@PostMapping("/updatevendor")
	public String updateVendor(VendorBean vendorBean) {
		vendorDao.updateVendor(vendorBean);
		return "redirect:/listvendor";// do not call jsp--- call other action/url/-- method
	}

}
