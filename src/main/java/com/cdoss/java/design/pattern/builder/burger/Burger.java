package com.cdoss.java.design.pattern.builder.burger;

import com.cdoss.java.design.pattern.builder.Item;
import com.cdoss.java.design.pattern.builder.Packing;
import com.cdoss.java.design.pattern.builder.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
