package com.springJdbc.dao;

import java.util.List;

import com.springJdbc.entities.UserInfo;

public interface UserDao {
	
	public int Insert(UserInfo user);
	public int change(UserInfo user);
	public int delete(int id);
	public UserInfo getUser(int id);
	public List<UserInfo> getAllUser();

}
