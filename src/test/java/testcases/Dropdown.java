package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	@Test
	public void dropdown()
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space(text())='Dropdown']")).click();
	WebElement dropdownElement = driver.findElement(By.id("dropdown"));
	driver.findElement(By.id("dropdown")).click();
	 Select dropdown = new Select(dropdownElement);
	 
	 List<WebElement> options = dropdown.getOptions();
	 for (WebElement option : options) {
         if (option.isEnabled()) {
             dropdown.selectByVisibleText(option.getText());
             System.out.println("Selected: " + option.getText());
         } else {
             System.out.println("Disabled: " + option.getText());
         }
     }
	//driver.findElements(By.xpath("//option[normalize-space(text())='Option 1']"));
	
}
}