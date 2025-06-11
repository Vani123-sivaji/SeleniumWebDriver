package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WYSEditor {
@Test
public void editor()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'WYSIWYG Editor')]")).click();
	WebElement innerFrame=driver.findElement(By.xpath("//body[@id='tinymce']//p[1]"));
	
	driver.switchTo().frame(innerFrame);
	driver.findElement(By.xpath("//body[@id='tinymce']//p[1]")).sendKeys("InnerIFrames");
	
	
}
}