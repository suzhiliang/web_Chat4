package com.szl.dao;

import java.util.List;

import com.szl.model.Manager;
import com.szl.model.User;

public interface IManagerDao {
    public void save(Manager manager);
	
	public List<Manager> getAll();
	
	public Manager getByManagerID(String managerID);
	
	public void delete(Manager manager);
	
	public void deleteByManagerID(String managerID);
	
	public Manager isValidManager(String managerName,String password);
	
	public Manager getByManagerName(String managerName);
	
}
