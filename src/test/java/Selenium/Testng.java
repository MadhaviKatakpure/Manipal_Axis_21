package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	
	@Test
	public void testScenario()
	{
		System.out.println("I an from test scenario");
	}
	@Test
	public void testScenario1()
	{
		System.out.println("I an from test scenario1");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am from before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am from after class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I am from before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am from after Method");
	}
	

}
