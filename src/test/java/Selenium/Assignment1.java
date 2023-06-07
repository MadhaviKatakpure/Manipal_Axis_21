package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		boolean signIn =driver.findElement(By.id("(//*[text()='Sign in'])[1]")).isDisplayed();
		System.out.println(signIn);
		
		Thread.sleep(5000);
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Mobiles, Computers")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("All Mobile Phones")).click();
		boolean mobile = driver.findElement(By.linkText("Mobiles & Accessories")).isDisplayed();
		System.out.println(mobile);
		
	}
}
