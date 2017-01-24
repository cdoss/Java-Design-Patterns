package com.cdoss.java.design.pattern.demo;

import com.cdoss.java.design.pattern.singleton.SingletonObject;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingletonObject singleton = SingletonObject.getInstance();
		singleton.showMessage();
	}
}
