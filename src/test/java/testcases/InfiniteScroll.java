package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfiniteScroll {
	
	@Test
	public void testinfinite() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\"/infinite_scroll\"]")).click();
	
    JavascriptExecutor js = (JavascriptExecutor) driver;

 // Scroll down by a specific amount (e.g., 500 pixels)
   // js.executeScript("window.scrollBy(0, 500)");
	
    // Scroll up by a specific amount (e.g., 500 pixels)
    //js.executeScript("window.scrollBy(0, -500)");
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Scroll to the bottom
    
    
    
    
    
    
}}