package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	@Test
	public void nestedframes() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href=\"/nested_frames\"]")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@data-new-gr-c-s-check-loaded='14.1229.0']")).click();

}
}