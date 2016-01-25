package com.szl.service.impl;

import java.util.List;

import com.szl.dao.IUserDao;
import com.szl.model.User;
import com.szl.service.IUserService;



public class UserServiceImpl implements IUserService{
	
	private IUserDao userDao;
	
	public void save(User user){
		userDao.save(user);
	}
	
	public List<User> getAll(){
		 return userDao.getAll();
	}
	
	public User getByUserName(String userName){
		return userDao.getByUserName(userName);
	}
	
	public User isValidUser(String userName,String password){
		return userDao.isValidUser(userName, password);
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public User getByNumber(String userNumber) {
		
		return userDao.getByNumber(userNumber);
	}

}
