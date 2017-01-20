package com.cdoss.java.design.pattern.factory.shape;

import com.cdoss.java.design.pattern.factory.IShape;

public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw(); method.");
	}

}
