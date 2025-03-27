package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptOnloadEvent {
@Test
public void Onloadevent() {
WebDriverManager.chromedriver().setup();	
WebDriver driver=new ChromeDriver();

driver.navigate().to("https://the-internet.herokuapp.com/");
driver.findElement(By.xpath("//a[@href=\"/javascript_error\"]")).click();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}