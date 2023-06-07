package org.Testcase;

import org.Manipal.PageObject.ComputerDemo;
import org.Manipal.PageObject.Desktop;
import org.Manipal.PageObject.HomePageDemo;
import org.Manipal.base.BaseConfigurationDemoWeb;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestCase extends BaseConfigurationDemoWeb {
	
	public HomePageDemo homeobj;
	public ComputerDemo computerobj;
	public Desktop desktopobj;
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=getDriver();
		homeobj= new HomePageDemo(driver);
		computerobj = new ComputerDemo(driver);
		desktopobj = new Desktop(driver);
	}
	
	@Test
	public void scenarioDemo()
	{
		homeobj.verifyLogo();
		homeobj.verifyLogIn();
		homeobj.verifyRegister();
		homeobj.verifyShoppingCart();
		homeobj.verifyWishList();
		computerobj.ComputerNavigation();
		desktopobj.DesktopNavigation();
	}

}
