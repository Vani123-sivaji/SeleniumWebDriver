package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	@Test(priority=1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("electronics");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//img[@alt='Cult Carson with Vibration & Warm Therapy, Air Compression, Pain Relief, Foot & calf Massager']")).click();
		//driver.findElement(By.xpath("//button[normalize-space(text())='Add to cart']")).click();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("get all links:" +links.size());

}
}