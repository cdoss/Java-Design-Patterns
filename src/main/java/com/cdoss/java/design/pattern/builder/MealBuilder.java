package com.cdoss.java.design.pattern.builder;

import com.cdoss.java.design.pattern.builder.burger.ChickenBurger;
import com.cdoss.java.design.pattern.builder.burger.VeggieBurger;
import com.cdoss.java.design.pattern.builder.drink.Coke;
import com.cdoss.java.design.pattern.builder.drink.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
