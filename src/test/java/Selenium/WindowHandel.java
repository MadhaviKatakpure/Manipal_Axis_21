package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KATAKPURE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> it=windowId.iterator();
		while(it.hasNext())
		{
			String child = it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.xpath("//a[text()='Sign in']"));
		driver.switchTo().window(parent);

	}

}
