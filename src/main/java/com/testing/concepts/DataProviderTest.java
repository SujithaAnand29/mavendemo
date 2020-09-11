package com.testing.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="MyDataProvider")
	private void logIn(String username, String password) {
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
	@DataProvider(name="MyDataProvider")
	private Object[][] credentials() {
		return new Object[][] {
			{"Dhikshith","1234"},
			{"Suji","2345"},
			{"Anand","3456"}
		};
	}
	

}
