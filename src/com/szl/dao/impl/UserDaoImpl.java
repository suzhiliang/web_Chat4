package com.szl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import com.szl.dao.IUserDao;
import com.szl.model.User;

public class UserDaoImpl  implements IUserDao{
	private HibernateTemplate hibernateTemplate;
	public void save(User user){
		hibernateTemplate.saveOrUpdate(user);
	}
	
    public List<User> getAll(){
    	List<User> list = hibernateTemplate.find("from User");
    	return list;
    }
    
    public User getByUserName(String userName){
    	List<User> list = hibernateTemplate.find("from User where username='"+userName+"'");
    	if(list!=null&&list.size()>0){
    		return list.get(0);
    	}
		return null;
	}
   
    public User isValidUser(String userName,String password){
    	List<User> list = hibernateTemplate.find("from User where username='"+userName+"' and password='"+password+"'");
    	if(list!=null&&list.size()>0){
    		return list.get(0);
    	}
    	return null;
    }

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public User getByNumber(String userNumber) {
		return (User)getHibernateTemplate().get(User.class, userNumber);
	}

}
	
