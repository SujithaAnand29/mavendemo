package com.testing.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test(enabled=false) 
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	@Ignore
	@Test 
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test
	private void searchWatch() {
		System.out.println("Search Watch");
	}

}
