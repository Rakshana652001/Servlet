package com.chainsys.model;

public class Demo 
{
	String name;
	String emailID;
	String phoneNumber;
	public Demo()
	{
		
	}
	public Demo(String name, String emailID, String phoneNumber){
		this.name = name;
		this.emailID = emailID;
		this.phoneNumber = phoneNumber;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", emailID=" + emailID + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
