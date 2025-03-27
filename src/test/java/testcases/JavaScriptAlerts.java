package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlerts {

@Test
public void javascriptalerts() {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.navigate().to("https://the-internet.herokuapp.com/");
driver.findElement(By.xpath("//a[@href=\"/javascript_alerts\"]")).click();	
//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
/*Alert al=driver.switchTo().alert();	
System.out.println(al.getText());
al.accept();*/	
Alert al1=driver.switchTo().alert();
//al1.accept();
al1.dismiss();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}