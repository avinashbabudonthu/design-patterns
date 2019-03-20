package com.creational.builder.pattern;

import org.junit.Test;

public class BuilderPattern {

	@Test
	public void execute() {
		MealBuilder mealBuilder = new MealBuilder();

		System.out.println("------ veg meal --------");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg meal price=" + vegMeal.getPrice());
		vegMeal.display();

		System.out.println("------ non veg meal --------");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("non veg meal price=" + nonVegMeal.getPrice());
		nonVegMeal.display();
	}
}