package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizontalSlider {
	
@Test
public void horizontalslider() {	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\"/horizontal_slider\"]")).click();
	
	WebElement element=driver.findElement(By.xpath("//input[@type='range']"));
	
	
	Actions actions=new Actions(driver);
	
	actions.moveToElement(element)
	.click()
	.sendKeys(Keys.ARROW_RIGHT)
	.perform();
	
	
	
	
	
	
	
	
}	
}
