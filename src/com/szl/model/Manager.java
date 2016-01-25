package com.szl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="manager")
public class Manager {
	private String managerID;
	private String managerName;
	private String password;
	private String phone;
	private String QQ;
	@Id
	@GeneratedValue
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
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
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setQQ(String QQ) {
		this.QQ = QQ;
	}
	public String getQQ() {
		return QQ;
	}
	

}
