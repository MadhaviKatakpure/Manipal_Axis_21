package org.Manipal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageDemo {
	WebDriver driver;
	
	public HomePageDemo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@ alt='Tricentis Demo Web Shop']")
	public WebElement logo;
	
	@FindBy(xpath="//a[text()='Register']")
	public WebElement register;
	
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement logIn;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	public WebElement shoppingCart;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	public WebElement wishList;
	
	public void verifyLogo()
	{
		System.out.println(logo.isDisplayed());
		Assert.assertTrue(logo.isDisplayed(),"Logo is displayed");
	}
	
	public void verifyRegister()
	{
		System.out.println(register.isDisplayed());
		Assert.assertTrue(register.isDisplayed(),"Logo is displayed");
	}
	
	public void verifyLogIn()
	{
		System.out.println(logIn.isDisplayed());
		Assert.assertTrue(logIn.isDisplayed(),"Logo is displayed");
	}
	
	public void verifyShoppingCart()
	{
		System.out.println(shoppingCart.isDisplayed());
		Assert.assertTrue(shoppingCart.isDisplayed(),"Logo is displayed");
	}
	
	public void verifyWishList()
	{
		System.out.println(wishList.isDisplayed());
		Assert.assertTrue(wishList.isDisplayed(),"Logo is displayed");
	}

}
