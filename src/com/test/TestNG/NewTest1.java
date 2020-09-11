package com.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
 
	//Make sure not to create the package if we are creating the package by the time of new creation of the TestNG xml files.
	/*Created by Prasanga Fernando
	 *On 2020.09.10
	 */
	
	@Test ()
	public void mainTestCase() {
		Assert.assertEquals("test", "test");
	}
	@Test (dependsOnMethods= {"mainTestCase"})
	public void secondTestCase() {
		Assert.assertEquals("test", "test");
	}
	@Test (dependsOnMethods= {"secondTestCase"})
	public void thirdTestCase() {
		Assert.assertEquals("test", "test");
	}
	@Test (dependsOnMethods= {"thirdTestCase"})
	public void fourthTestCase() {
		Assert.assertEquals("test", "test");
	}
}
