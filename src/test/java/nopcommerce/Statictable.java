package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statictable {

	@Test
	public static void table() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple table
		//int rows1=driver.findElements(By.tagName("tr")).size();//for single table
		//System.out.println("Number of rows:"+rows);
		
		//Thread.sleep(1000);
		
		//int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		
		//System.out.println("Number of columns:"+columns);
		
		Thread.sleep(1000);
		
		int columns1=driver.findElements(By.xpath("//table[@name='BookTable']//td")).size();
		
		System.out.println("Number of columns:"+columns1);
		//read data from all rows and columns
		
		for (int r=2;r<=rows;r++)
		{
			for (int c=1;c<=columns1;c++)
			{
				driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			}
		}
		
		//to print author name
		for (int r=2;r<=rows;r++)
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(authorname);
		}
		
		
	}

}
