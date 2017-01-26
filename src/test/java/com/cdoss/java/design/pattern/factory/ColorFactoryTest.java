package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorFactoryTest {

	private ColorFactory colorFactory;

	@Before
	public void setUp() {
		colorFactory = new ColorFactory();
	}

	@After
	public void tearDown() {
		colorFactory = null;
	}

	@Test
	public void testColorFactoryGetColorRed() {
		IColor color = colorFactory.getColor("RED");
		assertEquals("Red", color.getClass().getSimpleName());
	}

	@Test
	public void testColorFactoryGetColorBlue() {
		IColor color = colorFactory.getColor("BLUE");
		assertEquals("Blue", color.getClass().getSimpleName());
	}

	@Test
	public void testColorFactoryGetColorGreen() {
		IColor color = colorFactory.getColor("GREEN");
		assertEquals("Green", color.getClass().getSimpleName());
	}

	@Test
	public void testColorFactoryGetColorNotAvailable() {
		IColor color = colorFactory.getColor("PURPLE");
		assertNull(color);
	}

	@Test
	public void testColorFactoryGetColorNull() {
		IColor color = colorFactory.getColor(null);
		assertNull(color);
	}

	@Test
	public void testColorFactoryGetShapeCircle() {
		IShape shape = colorFactory.getShape("CIRCLE");
		assertNull(shape);
	}

	@Test
	public void testColorFactoryGetShapeNull() {
		IShape shape = colorFactory.getShape(null);
		assertNull(shape);
	}
}
