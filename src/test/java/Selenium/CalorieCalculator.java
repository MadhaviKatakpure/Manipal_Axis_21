package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalorieCalculator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
	
		driver.findElement(By.linkText("US Units")).click();
		driver.findElement(By.name("cage")).clear();
		driver.findElement(By.name("cage")).sendKeys("24");
		driver.findElement(By.name("cheightfeet")).clear();
		driver.findElement(By.name("cheightfeet")).sendKeys("5");
		driver.findElement(By.name("cheightinch")).clear();
		driver.findElement(By.name("cheightinch")).sendKeys("2");
		driver.findElement(By.name("cpound")).clear();
		driver.findElement(By.name("cpound")).sendKeys("100");
		driver.findElement(By.xpath("(//input[@alt='Calculate'])[1]")).click();
	
		
		
	}
}
