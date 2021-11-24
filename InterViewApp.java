package com.xworkz.InterPortal;

abstract public class InterViewApp {
	
	public InterViewApp() {
		System.out.println("Inside Interview App");
	}
	public  void Login(String GM, int pwd) {
		String gMailAccnt="abc123@gmail.com";
		int password=123000123;
		if(gMailAccnt==GM && password==pwd) {
	System.out.println("Login successfully");
	}
		else {
			System.out.println("Unsuccessful Login");
		}
		
	}
	public void logout() {
		System.out.println("LogOut successfully");
		
	}
	public void viewResult(int regRollNo) {
		System.out.println("Your score is"+regRollNo);
	}
	public void viewSchedule(int regRollNo) {
		System.out.println("View Schedule");
	}
	abstract public void prepareQuestionSet();
	abstract public void takeTest();
	
	

}
