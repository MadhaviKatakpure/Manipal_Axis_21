package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[contains(@id,'vfb-7-1')]")).click();
		
		boolean e=driver.findElement(By.xpath("//*[contains(@id,'vfb-6-0')]")).isEnabled();
		System.out.println(e);
		
		driver.findElement(By.xpath("//*[contains(@id,'vfb-6-0')]")).click();
	}
}
