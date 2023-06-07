package org.Manipal.base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseConfiguration {
	
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		return driver;
	}

}
