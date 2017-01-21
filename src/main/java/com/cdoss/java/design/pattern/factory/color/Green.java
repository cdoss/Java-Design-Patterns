package com.cdoss.java.design.pattern.factory.color;

import com.cdoss.java.design.pattern.factory.IColor;

public class Green implements IColor {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
