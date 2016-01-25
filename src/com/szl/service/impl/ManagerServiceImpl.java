package com.szl.service.impl;

import java.util.List;

import com.szl.dao.IManagerDao;
import com.szl.model.Manager;
import com.szl.service.IManagerService;

public class ManagerServiceImpl implements IManagerService {
    private IManagerDao managerDao;
	public void delete(Manager manager) {
		managerDao.delete(manager);
		
	}

	public void deleteByManagerId(String managerID) {
		managerDao.deleteByManagerID(managerID);
		
	}

	public List<Manager> getAll() {
		
		return managerDao.getAll();
	}

	public Manager getByManagerID(String managerID) {
		
		return managerDao.getByManagerID(managerID);
	}

	public IManagerDao getManagerDao() {
		return managerDao;
	}

	public Manager isValidManager(String managerName, String password) {
	
		return  managerDao.isValidManager(managerName, password);
	}

	public void save(Manager manager) {
		
		managerDao.save(manager);
		
	}

	public void setManagerDao(IManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	public Manager getByManagerName(String managerName) {
		
		return managerDao.getByManagerName(managerName);
	}

}
