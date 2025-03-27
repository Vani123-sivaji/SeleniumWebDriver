package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationMessages {

	@Test
	public void notificationmessages()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Notification Messages')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
	
	
	}	
	@Test
	public void redirectlink() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href=\"/redirector\"]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
}
