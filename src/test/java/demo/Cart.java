package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart {

	@Test
	public void loginTest(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        

        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
        driver.findElement(By.xpath("//u[normalize-space()='here']")).click();
        driver.findElement(By.xpath("//div[15]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
        driver.findElement(By.xpath("//body")).click();
        driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("9");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vani");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='review']")).sendKeys("niceproduct value for the  money");
        driver.findElement(By.xpath("//button[@id='button-review']")).click();
	
	
	
	}	
	
}
