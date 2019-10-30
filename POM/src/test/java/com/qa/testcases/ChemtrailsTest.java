package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.base.TestBase;
import com.qa.pages.Chemtrails;

public class ChemtrailsTest extends TestBase{
	Chemtrails chemtrails;
	
	public ChemtrailsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		chemtrails = new Chemtrails();
	}
	
	@Test
	public void chemtrailsGetTextTest() {
		String title = chemtrails.getText();
		Assert.assertEquals(title, "Google");
	}
	
	@AfterMethod
	public void teardDown() {
		driver.quit();
	}

}
