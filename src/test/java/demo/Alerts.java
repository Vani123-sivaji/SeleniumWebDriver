package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	

	@Test
	public void loginTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();	
        
	
	
        driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
	
        driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
        
       /* driver.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]")).click();
	
        Alert al=driver.switchTo().alert();	
		System.out.println(al.getText());
		al.accept();*/
        
       /* driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
     // Alert accept and dismiss		
        
		Alert al1=driver.switchTo().alert();
		//al1.accept();
		al1.dismiss();*/
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		
		Alert al2=driver.switchTo().alert();
		al2.sendKeys("Ok");
		al2.accept();
	
		
	
	
	
	}	
}
