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

	public ArrayList<UserBean> getAllUsers() {
		return users;
	}
	// insert
	// delete
	// udpate
	// select

	public boolean deleteUser(int userId) {
		int index = -1;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserId() == userId) {
				index = i;
				break;
			}

		}
		if (index == -1)
			return false;
		else {
			users.remove(index);
			return true;
		}
	}

	public UserBean getUserById(int userId) {

		int index = -1;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserId() == userId) {
				index = i;
				break;
			}

		}
		if (index == -1)
			return null;
		else {
			return users.get(index);
		}
	}

}
