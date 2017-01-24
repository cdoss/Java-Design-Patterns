package com.cdoss.java.design.pattern.factory;

import com.cdoss.java.design.pattern.factory.color.Blue;
import com.cdoss.java.design.pattern.factory.color.Green;
import com.cdoss.java.design.pattern.factory.color.Red;

public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		return null;
	}

	@Override
	public IColor getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

}
