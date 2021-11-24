package com.xworkz.NICPortal;

public abstract class NIC_Services {
	String adminName;
	String password;
	String announcement;
	String AboutUs;
	String recruitment;
	
	public NIC_Services() {
		System.out.println("Inside NIC Services");
	}
	public void login() {
		System.out.println("Login successful");
		
	}
	public void logout() {
		System.out.println("Logout successful");
		
	}
	abstract public void latestNews();
	abstract public void aboutUs();
	abstract public void recruitment();
	
	
	

}
