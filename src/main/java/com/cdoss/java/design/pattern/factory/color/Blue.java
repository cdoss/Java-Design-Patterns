package com.cdoss.java.design.pattern.factory.color;

import com.cdoss.java.design.pattern.factory.IColor;

public class Blue implements IColor {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
