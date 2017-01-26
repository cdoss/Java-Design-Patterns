package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {

	private AbstractFactory shapeFactory;
	
	@Before
	public void setUp(){
		shapeFactory = new ShapeFactory();
	}
	
	@After
	public void tearDown(){
		shapeFactory = null;
	}
	
	@Test
	public void testShapeFactoryGetShapeCircle(){
		IShape shape = shapeFactory.getShape("CIRCLE");
		assertEquals("Circle", shape.getClass().getSimpleName());
	}
	
	@Test
	public void testShapeFactoryGetShapeRectangle(){
		IShape shape = shapeFactory.getShape("RECTANGLE");
		assertEquals("Rectangle", shape.getClass().getSimpleName());
	}
	
	@Test
	public void testShapeFactoryGetShapeSquare(){
		IShape shape = shapeFactory.getShape("SQUARE");
		assertEquals("Square", shape.getClass().getSimpleName());
	}
	
	@Test
	public void testShapeFactoryGetShapeTriangle(){
		IShape shape = shapeFactory.getShape("TRIANGLE");
		assertNull(shape);
	}
	
	@Test
	public void testShapeFactoryGetShapeNull(){
		IShape shape = shapeFactory.getShape(null);
		assertNull(shape);
	}

	@Test
	public void testShapeFactoryGetColorRed() {
		IColor color = shapeFactory.getColor("RED");
		assertNull(color);
	}

	@Test
	public void testShapeFactoryGetColorNull(){
		IColor color = shapeFactory.getColor(null);
		assertNull(color);
	}
}
