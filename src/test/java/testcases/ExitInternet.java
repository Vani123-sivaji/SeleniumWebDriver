package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExitInternet {
	@Test
	public void ExitInternet() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[normalize-space(text())='Exit Intent']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//p[normalize-space(text())='Close']")).click();
	
	
	
	}	
}
