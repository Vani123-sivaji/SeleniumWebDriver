package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	@Test
	public void draganddrop()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space(text())='Drag and Drop']")).click();
	WebElement A=driver.findElement(By.id("column-a"));
	WebElement B=driver.findElement(By.id("column-b"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(A , B).perform();
}
}