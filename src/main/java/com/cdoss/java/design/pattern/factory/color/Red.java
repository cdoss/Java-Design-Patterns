package com.cdoss.java.design.pattern.factory.color;

import com.cdoss.java.design.pattern.factory.IColor;

public class Red implements IColor {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
