package com.xworkz.Car;

abstract public class Car {
	int price;
	
	public Car() {
		System.out.println("Inside Car method");
	}
	public void checkCoolant() {
		System.out.println("Check from  overheating");
	}
	public void thermostat() {
		System.out.println("Check temprature");
	}
	abstract public void model();
	abstract public void color();
	abstract public void baseEngine();
	
	
	

}
