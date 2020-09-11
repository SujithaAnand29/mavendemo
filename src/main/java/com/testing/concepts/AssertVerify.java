package com.testing.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {
	
	//Hard Assert
	@Test
	private void test1() {
		System.out.println("Assertion Started");
		Assert.assertEquals("Suji", "Suji");
		System.out.println("Assertion completed");
	}
	
	//Soft Assert
	@Test
	private void test2() {
		SoftAssert soft=new SoftAssert();
		System.out.println("Verification Started");
		soft.assertEquals("Anand", "AnandRaja");
		System.out.println("Verification completed");
		soft.assertAll();
	}

}
