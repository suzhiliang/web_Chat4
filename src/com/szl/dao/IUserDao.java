package com.szl.dao;

import java.util.List;

import com.szl.model.User;

public interface IUserDao {
	
	public void save(User user);
	
	public List<User> getAll();
	
	public User getByUserName(String userName);
	
	public User isValidUser(String userName,String password);
	
	public User getByNumber(String userNumber);

}
