package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement accountSignIn=driver.findElement(By.id("nav-link-accountList"));
		WebElement youraccount=driver.findElement(By.xpath("//span[text()='Your Account']"));
		a.moveToElement(accountSignIn).contextClick(youraccount).build().perform();
		
	
		
	}
}
