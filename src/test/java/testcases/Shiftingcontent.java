package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shiftingcontent {

@Test	
public void shiftingcontent() throws InterruptedException 
{	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");	
	
	driver.findElement(By.xpath("//a[@href=\"/shifting_content\"]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Example 1: Menu Element')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	
	driver.findElement(By.xpath("//a[@href=\"/shifting_content\"]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Example 2: An image')]")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//a[contains(text(),'Example 3: List')]")).click();
	Thread.sleep(1000);
	
}
}