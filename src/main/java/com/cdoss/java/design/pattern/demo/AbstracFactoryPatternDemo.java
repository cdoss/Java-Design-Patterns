package com.cdoss.java.design.pattern.demo;

import com.cdoss.java.design.pattern.factory.AbstractFactory;
import com.cdoss.java.design.pattern.factory.FactoryProducer;
import com.cdoss.java.design.pattern.factory.IColor;
import com.cdoss.java.design.pattern.factory.IShape;

public class AbstracFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		IShape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		IShape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		IShape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		IColor color1 = colorFactory.getColor("RED");
		color1.fill();
		
		IColor color2 = colorFactory.getColor("BLUE");
		color2.fill();
		
		IColor color3 = colorFactory.getColor("GREEN");
		color3.fill();
	}
}
