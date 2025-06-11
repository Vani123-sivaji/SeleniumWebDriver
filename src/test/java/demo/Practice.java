package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	@Test
	public void loginTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();		
	
        driver.findElement(By.xpath("//a[normalize-space()='Practice Site']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();
        driver.findElement(By.xpath("//li[@class='post-169 product type-product status-publish product_cat-android product_tag-android has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock sale downloadable taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart'][normalize-space()='Add to basket']")).click();
        driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
	
        driver.findElement(By.xpath("//a[normalize-space()='Android Quick Start Guide']")).click();
	
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	
	
	
	
	
	
	}	
}
