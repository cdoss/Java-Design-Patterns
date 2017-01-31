package com.cdoss.java.design.pattern.builder.burger;

public class VeggieBurger extends Burger {

	@Override
	public String name() {
		return "Veggie Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
