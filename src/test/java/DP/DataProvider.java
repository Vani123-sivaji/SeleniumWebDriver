package DP;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	public void testlogin()
	{
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='email']")).sendKeys("gvani847@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("Vani@1990");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	
	
	 Object[][] logindata()
	{
		Object data[][]= {
				{"abc@gmail.com", "abc@123"},
								
				{"test@gmail.com", "test@123"}
			
		};
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
}
