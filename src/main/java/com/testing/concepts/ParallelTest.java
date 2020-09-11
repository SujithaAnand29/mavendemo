package com.testing.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	private void test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium concepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	private void test2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium concepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
}
