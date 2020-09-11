package com.testing.concepts;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=2) // same priority will take in alphabetical order
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test // non prioritized will be executed first
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test(priority=2)
	private void searchTv() {
		System.out.println("Search TV");
	}

	@Test(priority=3)
	private void searchWatch() {
		System.out.println("Search Watch");
	}

	@Test(priority=4)
	private void searchTab() {
		System.out.println("Search Tab");
	}

}
