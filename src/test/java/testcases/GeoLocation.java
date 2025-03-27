package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation {
	@Test
	public void geolocation() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href='/geolocation']")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Where am I?')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'See it on Google')]")).click();
	
	
	}	
}
