package com.cdoss.java.design.pattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		IShape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();

		IShape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		IShape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
