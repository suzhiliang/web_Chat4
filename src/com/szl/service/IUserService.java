package com.szl.service;

import java.util.List;

import com.szl.model.User;

public interface IUserService {
	
	public void save(User user);
	
	public List<User> getAll();
	
	public User getByUserName(String userName);
	
	public User isValidUser(String userName,String password);
	
	public User getByNumber(String userNumber);

}
