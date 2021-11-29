package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	// table -- inMemory
	ArrayList<UserBean> users = new ArrayList<UserBean>();

	public boolean addUser(UserBean user) {

		users.add(user);
		return true;
	}

	public ArrayList<UserBean> getAllUsers(){
		return users;
	}
	// insert
	// delete
	// udpate
	// select

}
