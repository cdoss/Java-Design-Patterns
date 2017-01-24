package com.cdoss.java.design.pattern.factory;

public abstract class AbstractFactory {
	public abstract IShape getShape(String shape);
	public abstract IColor getColor(String color);
}
