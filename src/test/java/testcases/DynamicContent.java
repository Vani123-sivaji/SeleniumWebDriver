package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicContent {

@Test
public void dynamiccontent()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\'/dynamic_content\']")).click();
	driver.findElement(By.xpath("//a[@href=\'/dynamic_content?with_content=static\']")).click();
	
	
}
@Test
public void dynamiccontrolls()
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href=\'/dynamic_controls\']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	WebElement button=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	Actions act=new Actions(driver);
	act.doubleClick(button).perform();
	
	//driver.findElement(By.xpath("//a[contains(text(), 'Add')]")).click();//button[@type='button'])[1]
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
}
@Test
public void dynamicloading()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href=\'/dynamic_loading\']")).click();
	/*driver.findElement(By.xpath("//a[@href=\'/dynamic_loading/1\']")).click();
	driver.findElement(By.xpath("//button[normalize-space(text())='Start']")).click();*/
	driver.findElement(By.xpath("//a[@href=\'/dynamic_loading/2\']")).click();
	driver.findElement(By.xpath("//button[normalize-space(text())='Start']")).click();
	
	
	
	
}
}