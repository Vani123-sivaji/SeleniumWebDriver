package w3schools;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
WebDriver driver;

@Test(priority=1)
public void openapp()	
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}

@Test(priority=2)
public void testlogo() throws InterruptedException
{
	Thread.sleep(1000);
	boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("Logo is displayed"+status);
}

@Test(priority=3)
public void join()
{
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys(" Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}


}
