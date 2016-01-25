package com.szl.model;

import javax.persistence.*;

/**
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="use")
public class User implements java.io.Serializable {

	// Fields
    private String userNumber;
	private String username;
	private String password;
	private String sex;
	private String email;
	private String qq;
	private String signature;
	private String grade;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String sex, String email) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	/** full constructor */
	public User(String username, String password, String sex, String email,
			String qq, String signature, String grade) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.qq = qq;
		this.signature = signature;
		this.grade = grade;
	}
	@Id
    @GeneratedValue
	public String getUserNumber() {
		return userNumber;
	}
	// Property accessors
    @Column(name="username",length=20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
   @Column(name="password",length=20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  @Column(name="sex",length=2)
	public String getSex() {
		return this.sex;
	}
   
	public void setSex(String sex) {
		this.sex = sex;
	}
   @Column(name="email",length=50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   @Column(name="qq",length=20)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	 @Column(name="signature",length=300)
	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	@Column(name="grade",length=20)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	

}