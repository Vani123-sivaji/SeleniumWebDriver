package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
@Test
	public void filedownload()
	{
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\"/download\"]")).click();
	driver.findElement(By.xpath("//a[@href=\"download/test1.png\"]")).click();
}
@Test(priority=2)
public void fileupload() throws AWTException, InterruptedException
{
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href=\'/upload\']")).click();
	//driver.findElement(By.xpath("//input[@type='file'][1]")).sendKeys("C:\\Users\\HP\\Downloads\\test.png");
	
	//driver.findElement(By.name("file")).click();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='file'][1]")));
	
	Thread.sleep(2000);
	//copy the file path in to the clip board
	StringSelection filePathSelection=new StringSelection("C:\\Users\\HP\\Downloads\\test.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
	
	Thread.sleep(2000);
	//Paste the file path
	Robot rb=new Robot();
	
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	//click on return and enter key
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	
	
}
}
