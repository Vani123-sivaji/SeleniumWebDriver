package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inputs {

@Test	
public void inputs() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[contains(text(),'Inputs')]")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234234557676876");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
