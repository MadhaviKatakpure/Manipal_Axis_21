package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByValue("INDIA");
		Thread.sleep(5000);
		sel.selectByVisibleText("GERMANY");
		Thread.sleep(5000);
		sel.selectByIndex(5);
		

	}

}
