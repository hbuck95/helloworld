package com.bae.helloworld.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.helloworld.logic.MapManager;

public class HelloWorldTest {
	private static MapManager mapManager;

	@BeforeClass
	public static void setup() {
		mapManager = MapManager.getInstance();
		mapManager.addString(1, "Red");
		mapManager.addString(2, "Blue");
		mapManager.addString(3, "Green");
		mapManager.addString(4, "Yellow");
		mapManager.addString(5, "Orange");
	}

	@Test
	public void testAddToMapPass() {
		assertFalse(false);
		mapManager.addString(6, "Black");
		assertTrue(mapManager.getStringMap().containsValue("Black"));
	}

	@Test
	public void testRetrieveFromMap() {
		assertEquals("Blue", mapManager.retrieveString(2));
	}

	@Test
	public void testMapManagerInstance() {
		assertEquals(mapManager, MapManager.getInstance());
	}

}
