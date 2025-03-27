package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {
	@Test
	public void forgotpassword()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains (text(), 'Forgot Password')]")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vanisivaji2013@gmail.com");
	driver.findElement(By.xpath("//i[contains(text(), 'Retrieve password')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
