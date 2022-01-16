package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.VendorBean;

@Repository
public class VendorDao {

	@Autowired
	JdbcTemplate stmt;

	// insert

	public void insertVendor(VendorBean vendor) {

		// executeUpdate => insert update delete ==> update
		// executeQuery => select

		stmt.update("insert into vendor (name,email,password) values (?,?,?)", vendor.getName(), vendor.getEmail(),
				vendor.getPassword());

	}
}
