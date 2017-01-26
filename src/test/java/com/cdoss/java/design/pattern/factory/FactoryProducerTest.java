package com.cdoss.java.design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryProducerTest {

	@Test
	public void testFactoryProducerGetFactoryColor() {
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		assertEquals("ColorFactory", colorFactory.getClass().getSimpleName());
	}
	
	@Test
	public void testFactoryProducerGetFactoryShape(){
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		assertEquals("ShapeFactory", shapeFactory.getClass().getSimpleName());
	}
	
	@Test
	public void testFactoryProducerGetFactoryNotAvailable(){
		AbstractFactory pizzaFactory = FactoryProducer.getFactory("PIZZA");
		assertNull(pizzaFactory);
	}
	
	@Test
	public void testFactoryProducerGetFactoryNull(){
		AbstractFactory nullFactory = FactoryProducer.getFactory(null);
		assertNull(nullFactory);
	}
}
