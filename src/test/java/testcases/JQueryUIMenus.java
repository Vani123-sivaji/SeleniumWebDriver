package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryUIMenus {

	@Test
	public void JqueryUIMinus() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");	
		driver.findElement(By.xpath("//a[contains(text(),'JQuery UI Menus')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Enabled')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for the element to be visible and clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space(text())='Downloads']")));
		//driver.findElement(By.xpath("//a[normalize-space(text())='Downloads']")).click();
     // Now interact with the element
        element.click();  // Example of interacting with the element
        
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("//a[normalize-space(text())='PDF']")).click();
       // driver.findElement(By.xpath("//a[normalize-space(text())='CSV']")).click();
         // driver.findElement(By.xpath("//a[normalize-space(text())='Excel']")).click();
        //driver.findElement(By.xpath("//a[normalize-space(text())='Back to JQuery UI']")).click();
        //driver.findElement(By.xpath("//a[normalize-space(text())='Menu']")).click();
          List<WebElement>downloads=(List<WebElement>) driver.findElement(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-front']"));
          selectdropdownvalues(downloads,"Downloads");
	}
	public static void selectdropdownvalues(List<WebElement>option,String value) {
		
		for (WebElement genericption : option) {
			if (genericption.getText().equals(value)) {
				genericption.click();
				break;
			}
		}
	}
	

}
