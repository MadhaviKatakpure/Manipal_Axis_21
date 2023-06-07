package org.Testcase;

import org.Manipal.PageObject.HomePage;
import org.Manipal.PageObject.MenuPage;
import org.Manipal.PageObject.MobilePage;
import org.Manipal.base.BaseConfiguration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 extends BaseConfiguration {
	
	public HomePage homeObj;
	public MenuPage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup()
	{
		driver=getDriver();
		homeObj=new HomePage(driver);
		menuObj=new MenuPage(driver);
		mobileObj=new MobilePage(driver);
	}
	
	@Test
	public void scenario1()
	{
		homeObj.verifyHomeLaunchSuccess();
		menuObj.menuNavigation();
		mobileObj.verifyMobileHeader();
	}

}
