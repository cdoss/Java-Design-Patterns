package com.cdoss.java.design.pattern.singleton;

public class SingletonObject {

	private static SingletonObject instance = new SingletonObject();

	private SingletonObject() {

	}

	public static SingletonObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World from Singleton pattern!");
	}
}
