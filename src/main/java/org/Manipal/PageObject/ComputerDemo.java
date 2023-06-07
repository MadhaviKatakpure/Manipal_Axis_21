package org.Manipal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComputerDemo {
	WebDriver driver;
	Actions act;
	
	public ComputerDemo(WebDriver driver)
	{
		this.driver=driver;
		this.act=new Actions(driver);
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	public WebElement computer;
	
	@FindBy(xpath="(//a[@href='/desktops'])[1]")
	public WebElement desktop;
	
	public void ComputerNavigation()
	{
		act.moveToElement(computer).build().perform();
		desktop.click();
	}

}
