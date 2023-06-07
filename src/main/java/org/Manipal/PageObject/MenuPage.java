package org.Manipal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
WebDriver driver;
	
	public  MenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement hamburger;
	

	@FindBy(xpath="//*[text()='Mobiles, Computers']")
	public WebElement MobileComputerMenLb1;
	
	@FindBy(xpath="//*[text()='All Mobile Phones']")
	public WebElement allMobileLb1;
	
	public void menuNavigation()
	{
		hamburger.click();
		MobileComputerMenLb1.click();
		allMobileLb1.click();
	}

}
