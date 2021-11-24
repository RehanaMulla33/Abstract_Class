package com.xworkz.Shape;

abstract public class Shape_object {
	String color;
	String bgColor;
	int size;
	
	public Shape_object() {
		System.out.println("Inside Shape Object");
	}
	public void sizeObject() {
		System.out.println("Shape of the object in pixels");
		
	}
	

	abstract public void drawObject();
	abstract public void fillColor();
	}


