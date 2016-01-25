package com.szl.service;

import java.util.List;

import com.szl.model.Manager;

public interface IManagerService {
    
	public void save(Manager manager);
	
	public List<Manager> getAll();
	
	public Manager getByManagerID(String managerID);
	
	public void delete(Manager Manager);
	
	public void deleteByManagerId(String managerID);
	
	public Manager isValidManager(String managerName,String password);
	
	public Manager getByManagerName(String managerName);

}
