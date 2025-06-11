package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {

@Test	
public void shadowDOM() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	WebElement element=driver.findElement(By.xpath("//a[@href=\"/shadowdom\"]"));
	
	// Click the element to open a new window or modal
    element.click();
    
    
 // Get the text of the element
    String text = element.getText();

    // Print the text
    System.out.println("Text from element: " + text);
	
/*	WebElement clickableElement = driver.findElement(By.xpath("//a[@href=\"/shadowdom\"]"));
	clickableElement.click();

	WebElement element = null;
	boolean isElementFound = false;

	while (!isElementFound) {
	    try {
	        // Try to find the element
	        element = driver.findElement(By.xpath("//a[@href=\"/shadowdom\"]"));
	        String text = element.getText();
	        System.out.println("Text: " + text);
	        isElementFound = true;  // Exit the loop if successful
	    } catch (StaleElementReferenceException e) {
	        // Catch the exception and retry
	        System.out.println("Element is stale, retrying...");
	        Thread.sleep(1000);  // Wait for a moment before retrying
	    }
	}*/
}
}