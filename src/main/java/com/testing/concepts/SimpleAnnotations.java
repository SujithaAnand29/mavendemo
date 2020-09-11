package com.testing.concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@BeforeSuite
	private void setUp() {
		System.out.println("Set Up");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter URL");
	}
	@BeforeMethod
	private void logIn() {
		System.out.println("Log In");
	}
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	@AfterMethod
	private void logOut() {
		System.out.println("Log Out");
	}
	@AfterClass
	private void verifyHomePage() {
		System.out.println("Verify  Home page");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("Delete Cookies");
	}
}
