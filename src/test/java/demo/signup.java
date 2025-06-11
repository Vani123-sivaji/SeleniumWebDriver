package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signup {

	@Test
	public void loginTest(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        //driver.close();
      
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vani");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("cherith@gmail.com");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
        
      
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vani@123");
       
        driver.findElement(By.xpath("//option[normalize-space()='4']")).click();//option[normalize-space()='March']
        driver.findElement(By.xpath("//option[normalize-space()='March']")).click();//option[@value='2020']
        driver.findElement(By.xpath("//option[@value='2020']")).click();//option[@value='India']
    	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
    	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Vani");
    	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("G");
    	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("MRPALLI");
    	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Tirupati");
    	driver.findElement(By.xpath("//option[@value='India']")).click();
    	
    	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("AP");
    	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("TIRUPATI");
    	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("517502");
    	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("1234567654");
    	driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
    	
    	//String text = element.getText();
    	//System.out.println("Text from element: " + text);

}
}