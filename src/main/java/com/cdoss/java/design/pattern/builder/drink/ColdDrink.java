package com.cdoss.java.design.pattern.builder.drink;

import com.cdoss.java.design.pattern.builder.Bottle;
import com.cdoss.java.design.pattern.builder.Item;
import com.cdoss.java.design.pattern.builder.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
