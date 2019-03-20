package com.creational.prototype.pattern;

import org.junit.Test;

public class PrototypePattern {

	@Test
	public void execute() {
		ShapeCache.loadCache();

		Shape cachedCircle = ShapeCache.getShape("1");
		Shape cachedSquare = ShapeCache.getShape("2");
		Shape cachedRectangle = ShapeCache.getShape("3");

		System.out.println(cachedCircle.getType());
		cachedCircle.draw();

		System.out.println(cachedSquare.getType());
		cachedSquare.draw();

		System.out.println(cachedRectangle.getType());
		cachedRectangle.draw();
	}
}