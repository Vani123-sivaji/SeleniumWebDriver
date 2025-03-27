package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntryAd {
	@Test
	public void EntryAd()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[normalize-space(text())='Entry Ad']")).click();
	
	//driver.findElement(By.xpath("//a[@id='restart-ad']")).click();)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}