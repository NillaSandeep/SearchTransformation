package com.ibm.aa.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchControllerTest {
	@Test
	public void canaryTest() {
		String message = "This is a test";
		SearchController sc = new SearchController();
		assertEquals(message, sc.canaryMethod());
	}
}
