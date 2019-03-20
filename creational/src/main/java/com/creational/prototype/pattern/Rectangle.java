package com.creational.prototype.pattern;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "rectangle";
	}

	@Override
	public void draw() {
		System.out.println("rectangle draw() method");
	}

}
