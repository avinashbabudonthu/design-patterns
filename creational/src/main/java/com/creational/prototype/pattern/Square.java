package com.creational.prototype.pattern;

public class Square extends Shape {

	public Square() {
		type = "square";
	}

	@Override
	public void draw() {
		System.out.println("square draw() method");
	}

}