package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void loginTest(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        

        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("rambbc@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ram@123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        
        //driver.findElement(By.xpath("//div[@class='features_items']//div[2]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(By.xpath("//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
        //driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
        driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Vanisivaji");
        driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("123456781234");
        driver.findElement(By.xpath("//input[@placeholder='ex. 311']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("03");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2026");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Download Invoice']")).click();
        
        
        
	}
}
