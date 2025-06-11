package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageArrivalsDescription {

	@Test
	public void images() {

   /* 1) Open the browser
    2) Enter the URL “http://practice.automationtesting.in/”
    3) Click on Shop Menu
    4) Now click on Home menu button
    5) Test whether the Home page has Three Arrivals only
    6) The Home page must contains only three Arrivals
    7) Now click the image in the Arrivals
    8) Test whether it is navigating to next page where the user can add that book into his basket.
    9) Image should be clickable and should navigate to next page where user can add that book to his basket
    10) Click on Description tab for the book you clicked on.
    11) There should be a description regarding that book the user clicked on*/
		
	//1) Open the browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
			
	//2) Enter the URL “http://practice.automationtesting.in/”
	driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();	
    driver.findElement(By.xpath("//a[normalize-space()='Practice Site']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();
    
	//4) Now click on Home menu button
    driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	
    List<WebElement>links=driver.findElements(By.tagName("h3"));
    System.out.println("Total links in WebPage ::::::"+links.size());
	
    driver.findElement(By.xpath("//img[@title='Selenium Ruby']")).click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement descriptionElement = wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tab-description']"))
    );
    
   String productDescription = descriptionElement.getText();
	
   System.out.println("Product Description: " + productDescription);

   String actualDescription = descriptionElement.getText();
   String expectedDescription = "The Selenium WebDriver Recipes book";

   // Compare and print result
   boolean isDescriptionCorrect = actualDescription.contains(expectedDescription);
   System.out.println(isDescriptionCorrect); // prints true or false


	
	
	
	
	}	
}
