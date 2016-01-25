package com.szl.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.szl.dto.UserDto;
import com.szl.model.User;
import com.szl.service.IUserService;
import com.szl.util.Constants;

/**
 * @author 
 */
public class UserManagerAction extends ActionSupport implements ModelDriven{

	private IUserService userService;
	
	private UserDto userVo=new UserDto();
	
	private User user;	
	
	private List<User> users;
	
	
	//添加用户
	public String add() throws Exception {
		User user = new User();
		if(userService.getByUserName(userVo.getUsername())!=null){
			System.out.println("有错");
			return "addfail";	
		}
		else{
			user.setEmail(userVo.getEmail());
			user.setUsername(userVo.getUsername());
			user.setGrade(Constants.GENERAL_LEVEL);
			user.setQq(userVo.getQq());
			user.setSex(userVo.getSex());
			user.setPassword(userVo.getPassword());
			user.setSignature(userVo.getSignature());
			System.out.println("执行到里面了");
			userService.save(user);
			return "add";
		}
	}
	
	//编辑
	public String edit()throws Exception{
		user = userService.getByNumber(userVo.getUserNumber());
		return "edit";
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return userVo;
	}

	public User getUser() {
		return user;
	}

	public List<User> getUsers() {
		return users;
	}

	public IUserService getUserService() {
		return userService;
	}

	public UserDto getUserVo() {
		return userVo;
	}
	
	//遍历
	public String list()throws Exception{
		
		List<User> dtolist = userService.getAll();
		users = dtolist;   
		return "list";
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setUserVo(UserDto userVo) {
		this.userVo = userVo;
	}

	//更新
	public String update() throws Exception {
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		userService.save(user);
		return SUCCESS;
	}
}
