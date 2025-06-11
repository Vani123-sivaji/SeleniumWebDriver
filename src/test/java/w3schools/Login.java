package w3schools;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public static void w3() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.w3schools.com/");
	driver.manage().window().maximize();
	/*driver.findElement(By.xpath("//a[@class='user-anonymous tnb-signup-btn w3-bar-item w3-button w3-right ws-green ws-hover-green ga-top ga-top-signup']")).click();
	driver.findElement(By.xpath("//input[@placeholder='email']")).sendKeys("gvani847@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("Vani@1990");
	driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("Vani");
	driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("G");
	Thread.sleep(1000);
	WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].scrollIntoView(true);", element);

     // Optionally wait a bit and click it
     Thread.sleep(500); // Not best practice, prefer WebDriverWait
     element.click();
	*/
   
	
   driver.findElement(By.xpath("//a[@class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']")).click();
   driver.findElement(By.xpath("//input[@placeholder='email']")).sendKeys("gvani847@gmail.com");
   driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("Vani@1990");
   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
   /*WebElement element=driver.findElement(By.xpath("//button[contains(text(), 'Select')]"));
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].scrollIntoView(true);", element);

    //Optionally wait a bit and click it
   Thread.sleep(500); // Not best practice, prefer WebDriverWait
   element.click();
   driver.findElement(By.xpath("//button[contains(text(), 'Continue')]")).click();
   driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")).sendKeys("MYSQL");
   driver.findElement(By.xpath("//div[@id='tnb-google-search-submit-btn']//*[name()='svg']")).click();*/
   driver.findElement(By.xpath("//a[normalize-space()='MYSQL']")).click();
}
}