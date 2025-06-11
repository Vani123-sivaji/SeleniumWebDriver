package demo;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	@Test
	public void images() {
	//1) Open the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	
	//2) Enter the URL “http://practice.automationtesting.in/”
	driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();	
	//3) Click on Shop Menu
    driver.findElement(By.xpath("//a[normalize-space()='Practice Site']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();
    
	//4) Now click on Home menu button
    driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	//5) Test whether the Home page has Three Arrivals only
    List<WebElement>links=driver.findElements(By.tagName("h3"));
    System.out.println("Total links in WebPage ::::::"+links.size());
	

    for (WebElement link : links) {
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
	}	
	//6) The Home page must contains only three Arrivals
	//7) Now click the image in the Arrivals
    driver.findElement(By.xpath("//img[@title='Selenium Ruby']")).click();
	//8) Test whether it is navigating to next page where the user can add that book into his basket.
    driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
	//9) Image should be clickable and should navigate to next page where user can add that book to his basket	
	
 
	}	
}	

