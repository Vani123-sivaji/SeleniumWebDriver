package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Products {

	@Test
	public void loginTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/products']")).click();
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Lace Top For Women");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]")).click();
        driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
        driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("5");
        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        //Remove from the cart
        //driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        
        //Proceed to checkout
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
       
        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Print the title
        System.out.println("Page Title is: " + pageTitle);
	
        // Get current URL
        String currentUrl = driver.getCurrentUrl();

        // Print URL
        System.out.println("Current URL is: " + currentUrl);
        
        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("Total links in WebPage ::::::"+links.size());
	
        for (WebElement link : links) {
    		System.out.println(link.getText());
    		System.out.println(link.getAttribute("href"));
    	}	
        
        WebElement logo=driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        Thread.sleep(2000);
        System.out.println("Location(x,y)"+logo.getLocation());
	    System.out.println("Location(x)"+logo.getLocation().getX());
	    System.out.println("Location(y)"+logo.getLocation().getY());
       
	
	
	}	
}
