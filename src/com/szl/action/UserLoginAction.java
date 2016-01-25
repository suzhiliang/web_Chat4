package com.szl.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.szl.interceptor.AuthenticationInterceptor;
import com.szl.model.User;
import com.szl.service.IUserService;
import com.szl.util.Constants;

public class UserLoginAction extends ActionSupport implements SessionAware{

	IUserService userService;
	
	private String username;

	private String password;

	private  Map session;
	
	public String execute()throws Exception{		
		User user = userService.isValidUser(username, password);		
		if((user!=null)&&(!user.getGrade().equals(Constants.BLACK_LEVEL))){		
			session.put(AuthenticationInterceptor.USER_SESSION_KEY, user);
			return SUCCESS;	
		}else{
			if(user==null)
			{
				addActionError("输入的帐号或密码有误");
				System.out.println("输入的帐号或密码有误");
				return INPUT;
			}else{
				addActionError("你被拉入黑名单");
				System.out.println("你被拉入黑名单");
				return INPUT;
			}
		
		}		
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
