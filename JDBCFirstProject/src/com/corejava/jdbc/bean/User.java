package com.corejava.jdbc.bean;

import java.util.Date;

public class User {

	String firstname;
	int userid;
	String middlename;
	String lastname;
	String emailaddress;
	int activeflag;
	//Date activationdata;
	String username;
	String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public int getActiveflag() {
		return activeflag;
	}
	public void setActiveflag(int activeflag) {
		this.activeflag = activeflag;
	}
	/*
	public Date getActivationdata() {
		return activationdata;
	}
	public void setActivationdata(Date CURRENT_TIMESTAMP) {
		this.activationdata = CURRENT_TIMESTAMP;
	}
	*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}