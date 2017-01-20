package com.cdoss.java.design.pattern.factory;

import com.cdoss.java.design.pattern.factory.IShape;
import com.cdoss.java.design.pattern.factory.shape.Circle;
import com.cdoss.java.design.pattern.factory.shape.Rectangle;
import com.cdoss.java.design.pattern.factory.shape.Square;

public class ShapeFactory {

	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
