package com.creational.prototype.pattern;

public class Circle extends Shape {

	public Circle() {
		type = "circle";
	}

	@Override
	public void draw() {
		System.out.println("circle draw() method");
	}

}
