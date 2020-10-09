package com.springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.Dao.UserDao;
import com.springMVC.entities.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		int i = this.userDao.saveUser(user);
		return i;
	}

}
