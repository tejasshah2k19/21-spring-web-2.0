package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	public List<VendorBean> getAllVendors(){
		
		return stmt.query("select * from vendor", new BeanPropertyRowMapper<VendorBean>(VendorBean.class));
		
	}
	public  void deleteVendor(int vendorId) {
		stmt.update("delete from vendor where vendorid = ?",vendorId);
	}
}
