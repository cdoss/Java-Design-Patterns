package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorFactoryTest {

	@Test
	public void testGetColor() {
		IColor color1;
		IColor color2;
		IColor color3;
		IColor color4;
		IColor color5;

		ColorFactory colorFactory = new ColorFactory();

		color1 = colorFactory.getColor("RED");
		assertEquals("Red", color1.getClass().getSimpleName());

		color2 = colorFactory.getColor("BLUE");
		assertEquals("Blue", color2.getClass().getSimpleName());

		color3 = colorFactory.getColor("GREEN");
		assertEquals("Green", color3.getClass().getSimpleName());

		color4 = colorFactory.getColor("PURPLE");
		assertNull(color4);

		color5 = colorFactory.getColor(null);
		assertNull(color5);
	}

	@Test
	public void testGetShape() {
		ColorFactory colorFactory = new ColorFactory();

		IShape shape1 = colorFactory.getShape("CIRCLE");
		assertNull(shape1);
	}

}
