package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {

	public void checkout() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();		

	
    driver.findElement(By.xpath("//a[normalize-space()='Practice Site']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();
	
	
    driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	
    List<WebElement>links=driver.findElements(By.tagName("h3"));
    System.out.println("Total links in WebPage ::::::"+links.size());
	

    for (WebElement link : links) {
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
	}	
	
    driver.findElement(By.xpath("//img[@title='Selenium Ruby']")).click();
	
    driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
	
	
	
}
}