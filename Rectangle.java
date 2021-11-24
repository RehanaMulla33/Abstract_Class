package com.xworkz.Shape;

public class Rectangle extends Shape_object{
	public Rectangle() {
		System.out.println("Inside Rectangle method");
	}

	@Override
	public void drawObject() {
		System.out.println("Draw Rectangle here");		
	}

	@Override
	public void fillColor() {
		System.out.println("Fill pink color");		
	}
	

}
