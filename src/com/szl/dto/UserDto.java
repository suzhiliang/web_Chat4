package com.szl.dto;


public class UserDto {
	public String gradeName;
	
	private String userNumber;
    
	private String username;
	
	private String password;
	
	private String sex;

	private String email;

	private String qq;

	private String signature;

	private String grade;

	public String getEmail() {
		return email;
	}

	public String getGrade() {
		return grade;
	}

	public String getGradeName() {
		return gradeName;
	}

	public String getQq() {
		return qq;
	}

	public String getPassword() {
		return password;
	}

	public String getSex() {
		return sex;
	}

	public String getSignature() {
		return signature;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	public void setQq(String qq) {
		this.qq = qq;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserNumber() {
		return userNumber;
	}

}
