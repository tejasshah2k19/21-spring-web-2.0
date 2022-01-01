package com.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	// table -- inMemory
	ArrayList<UserBean> users = new ArrayList<UserBean>();

	UserDao() {

		UserBean user1 = new UserBean();
		user1.setEmail("ram@gmail.com");
		user1.setFirstName("ram");
		user1.setPassword("ram123");

		UserBean user2 = new UserBean();
		user2.setEmail("ramanuj@gmail.com");
		user2.setFirstName("ramanuj");
		user2.setPassword("ramanuj123");

		UserBean user3 = new UserBean();
		user3.setEmail("ravan@gmail.com");
		user3.setFirstName("ravan");
		user3.setPassword("ravan123");

		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

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

	public boolean updateUser(UserBean user) {
		int index = -1;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserId() == user.getUserId()) {
				index = i;
				break;
			}

		}
		if (index == -1)
			return false;
		else {
			users.set(index, user);
			return true;
		}

	}

	public ArrayList<UserBean> searchUserByFirstName(String firstName) {
		ArrayList<UserBean> searchResult = new ArrayList<UserBean>();

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getFirstName().toLowerCase().contains(firstName.toLowerCase())) {
				searchResult.add(users.get(i));
			}
		}

		return searchResult;

	}

}
