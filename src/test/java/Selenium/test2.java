package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class test2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\KATAKPURE\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
