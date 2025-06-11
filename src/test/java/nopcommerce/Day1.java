package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	@Test
	public static void mainnopcommerce()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//Is Displayed
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo:"+logo.isDisplayed());
	
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display status :"+status);
	
	
		//Is Enabled
		//boolean status=driver.findElement(By.xpath("//input[@name='FirstName']")).isEnabled();
		//System.out.println("Status is enabled:"+status);
	
		//Is selected
		WebElement malerd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femalerd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
		System.out.println("Before selection.........");
		System.out.println(malerd.isSelected());//false
		System.out.println(femalerd.isSelected());//false
	
		System.out.println("After selection.........");
		malerd.click();//is selected
		System.out.println(malerd.isSelected());//true
		System.out.println(femalerd.isSelected());//false
	
	
	
}
}