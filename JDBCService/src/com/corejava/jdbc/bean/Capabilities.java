package com.corejava.jdbc.bean;

public class Capabilities {

	private int Id;
	private int Userid;
	private String typeofCapability;
	private String application;
	private String capabilitygivedate;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getTypeofCapability() {
		return typeofCapability;
	}
	public void setTypeofCapability(String typeofCapability) {
		this.typeofCapability = typeofCapability;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getCapabilitygivedate() {
		return capabilitygivedate;
	}
	public void setCapabilitygivedate(String capabilitygivedate) {
		this.capabilitygivedate = capabilitygivedate;
	}
	
}
