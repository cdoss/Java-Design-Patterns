package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testShapeFactory() {

		IShape shape1;
		IShape shape2;
		IShape shape3;
		IShape shape4;
		IShape shape5;

		ShapeFactory shapeFactory = new ShapeFactory();

		shape1 = shapeFactory.getShape("CIRCLE");
		assertEquals("Circle", shape1.getClass().getSimpleName());

		shape2 = shapeFactory.getShape("RECTANGLE");
		assertEquals("Rectangle", shape2.getClass().getSimpleName());

		shape3 = shapeFactory.getShape("SQUARE");
		assertEquals("Square", shape3.getClass().getSimpleName());

		shape4 = shapeFactory.getShape(null);
		assertNull(shape4);

		shape5 = shapeFactory.getShape("TRIANGLE");
		assertNull(shape5);
	}

}
