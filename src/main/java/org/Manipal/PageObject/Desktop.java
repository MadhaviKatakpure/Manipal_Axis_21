package org.Manipal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Desktop {
	WebDriver driver;
	
	public Desktop(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	public WebElement addToCart;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-72']")
	public WebElement addToCart1;
	
	public void DesktopNavigation()
	{
		addToCart.click();
		System.out.println(addToCart1.isDisplayed());
		Assert.assertTrue(addToCart1.isDisplayed(),"Add to Cart is displayed");
	}
	
	

}
