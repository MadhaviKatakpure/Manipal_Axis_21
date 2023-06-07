package org.Manipal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class MobilePage {
WebDriver driver;
	
	public  MobilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Mobiles & Accessories'])[1]")
	public WebElement mobileAndAccessories;
	
	public void verifyMobileHeader()
	{
		Assert.assertEquals(mobileAndAccessories.isDisplayed(), true);
	}
	

}
