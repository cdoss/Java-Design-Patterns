package com.cdoss.java.design.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetInstance() {
		SingletonObject singleton = SingletonObject.getInstance();
		assertEquals("SingletonObject", singleton.getClass().getSimpleName());
	}

}
