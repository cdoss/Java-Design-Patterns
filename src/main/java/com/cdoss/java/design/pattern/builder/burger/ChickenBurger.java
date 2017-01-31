package com.cdoss.java.design.pattern.builder.burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
