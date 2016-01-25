package com.szl.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.szl.interceptor.ManagerAuthenticationInterceptor;
import com.szl.model.Manager;
import com.szl.service.IManagerService;

public class ManagerLoginAction extends ActionSupport implements SessionAware{
    private String managerName;
    private String password;
    IManagerService managerService;
    private  Map<String, Object> session;
    public String execute()throws Exception{
    	Manager manager=managerService.isValidManager(managerName, password);
    	if(manager!=null){
    		session.put(ManagerAuthenticationInterceptor.MANAGER_SESSION_KEY, manager);
    		return SUCCESS;
    	}else{
    		addActionError("输入的管理员帐号或密码有误");
    		System.out.println("输入的管理员帐号或密码有误");
    		return INPUT;
    	}
    	
    	
    }
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public IManagerService getManagerService() {
		return managerService;
	}
	public void setManagerService(IManagerService managerService) {
		this.managerService = managerService;
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
    
}
