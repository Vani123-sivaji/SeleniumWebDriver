package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hovers {
@Test
public void hovers()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\"/hovers\"]")).click();
	WebElement desktopmenu=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
	WebElement Mac=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
	Actions act=new Actions(driver);
	act.moveToElement(desktopmenu).moveToElement(Mac).click().perform();
	
	
	
	
	
	
	
	
	
	
	
	
}
}