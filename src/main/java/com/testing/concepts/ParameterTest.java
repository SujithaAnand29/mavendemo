package com.testing.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
@Parameters({ "username", "passsword" })
public class ParameterTest {
		private void logIn(String username,String password) {
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
}