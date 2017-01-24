package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryProducerTest {

	@Test
	public void testGetFactory() {
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		assertEquals("ColorFactory", colorFactory.getClass().getSimpleName());
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		assertEquals("ShapeFactory", shapeFactory.getClass().getSimpleName());
		
		AbstractFactory pizzaFactory = FactoryProducer.getFactory("PIZZA");
		assertNull(pizzaFactory);
		
		AbstractFactory nullFactory = FactoryProducer.getFactory(null);
		assertNull(nullFactory);
	}

}
