package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keypresses {
	
@Test
public void keypresses()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\"/key_presses\"]")).click();
	
	Actions act=new Actions(driver);
	/*act.sendKeys(Keys.TAB);
	  act.perform();*/
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}