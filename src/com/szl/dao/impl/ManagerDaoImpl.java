package com.szl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.szl.dao.IManagerDao;
import com.szl.model.Manager;

public class ManagerDaoImpl implements IManagerDao{
	 private HibernateTemplate hibernateTemplate;
	public void delete(Manager manager) {
		hibernateTemplate.delete(manager);
	}

	public void deleteByManagerID(String managerID) {
		// TODO Auto-generated method stub
		Manager manager=(Manager)hibernateTemplate.get(Manager.class,managerID);
		hibernateTemplate.delete(manager);
	}

	public List<Manager> getAll() {
		return hibernateTemplate.loadAll(Manager.class);
	}

	public Manager getByManagerID(String managerID) {
		return (Manager)hibernateTemplate.get(Manager.class,managerID);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void save(Manager manager) {
		hibernateTemplate.saveOrUpdate(manager);
	
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Manager isValidManager(String managerName, String password) {
		List<Manager> list = hibernateTemplate.find("from Manager where managerName='"+managerName+"' and password='"+password+"'");
    	if(list!=null&&list.size()>0){
    		return list.get(0);
    	}
    	return null;
	}

	public Manager getByManagerName(String managerName) {
		List<Manager> list = hibernateTemplate.find("from Manager where managerName='"+managerName+"'");
    	if(list!=null&&list.size()>0){
    		return list.get(0);
    	}
    	return null;
	}

}
