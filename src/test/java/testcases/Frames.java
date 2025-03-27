package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	@Test
public void frames() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
	//driver.findElement(By.xpath("body")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	driver.findElement(By.xpath("//a[normalize-space(text())='iFrame']")).click();
	
	
	
	
}
}