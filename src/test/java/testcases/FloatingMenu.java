package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FloatingMenu {
@Test
public void floatingmenu()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[normalize-space(text())='Floating Menu']")).click();
	driver.findElement(By.xpath("//a[normalize-space(text())='Home']")).click();
	
	
	
	
	
}
}