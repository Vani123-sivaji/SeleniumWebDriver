package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusCodes {

@Test
public void statuscodes()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");	
	driver.findElement(By.xpath("//a[@href=\"/status_codes\"]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
	
	//a[@href="http://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml"]
	//table[@id='table-http-status-codes-1']
	
	String value=driver.findElement(By.xpath("//table[@id='table-http-status-codes-1']")).getText();
	System.out.println("Spefic value of rows in a table:" +value);
	
	
	
}
}