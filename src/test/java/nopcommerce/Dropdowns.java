package nopcommerce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	@Test
	public static void  drpdowns() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(1000);
	
	List<WebElement> list=driver.findElements(By.xpath("(//div[@role='presentation']//span)[1]"));
	System.out.println(list.size());
	
	for (int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium"))
{
	list.get(i).click();
	break;
	
}
	}
	
	
	
	
}
	
}