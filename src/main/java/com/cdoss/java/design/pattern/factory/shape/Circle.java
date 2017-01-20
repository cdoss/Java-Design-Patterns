package com.cdoss.java.design.pattern.factory.shape;

import com.cdoss.java.design.pattern.factory.IShape;

public class Circle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");	
	}
}
