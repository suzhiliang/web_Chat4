package com.szl.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.szl.dto.ManagerDto;
import com.szl.model.Manager;
import com.szl.service.IManagerService;



public class ManagerAction extends ActionSupport implements ModelDriven {
	private Manager manager;
	IManagerService managerService;
	List<Manager> managers;
	ManagerDto managerVO=new ManagerDto();
	//添加管理员
	public String add() throws Exception {
		Manager manager = new Manager();
		if(managerService.getByManagerName(managerVO.getManagerName())!=null){
			System.out.println("该管理员账户已存在");
			addActionError("该管理员账户已存在");
			return "addfail";	
		}
		else if(!managerVO.getPassword().equals(managerVO.getPassword2()))
		{
			addActionError("两次输入的密码不一致");
			return "addfail";
		}
		else if(!managerVO.getMGCommon().equals("123456")){
			addActionError("输入的口令不正确");
			return "addfail";
		}
		else{
			
			manager.setManagerName(managerVO.getManagerName());
			manager.setPassword(managerVO.getPassword());
			manager.setPhone(managerVO.getPhone());
			manager.setQQ(managerVO.getQQ());
			managerService.save(manager);
			return "addsuccess";
		}
	}

	//遍历
	public String list()throws Exception{
	    this.managers= managerService.getAll();  
		return "list";
	}
	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public IManagerService getManagerService() {
		return managerService;
	}
	public void setManagerService(IManagerService managerService) {
		this.managerService = managerService;
	}
	public ManagerDto getManagerVO() {
		return managerVO;
	}
	public void setManagerVO(ManagerDto managerVO) {
		this.managerVO = managerVO;
	}
	public Object getModel() {
		// TODO Auto-generated method stub
		return managerVO;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

}
