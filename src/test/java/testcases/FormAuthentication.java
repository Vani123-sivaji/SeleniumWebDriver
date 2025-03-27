package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAuthentication {
@Test
public void Formauthentication() {	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//i[normalize-space(text())='Login']")).click();
	driver.findElement(By.xpath("//i[contains(text(), ' Logout')]")).click();
	
}
}