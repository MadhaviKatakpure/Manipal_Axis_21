package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert obj =driver.switchTo().alert();
		obj.accept();
		Thread.sleep(5000);
		obj.accept();
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		System.out.println(obj.getText());
		obj.dismiss();
	}

}
