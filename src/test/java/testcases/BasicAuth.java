package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BasicAuth {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//Add/Remove elements
		/*driver.findElement(By.xpath("//a[@href=\'/add_remove_elements/']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Add Element')]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Delete')]")).click();
		//Basic Auth
		
		//driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		
		//Check boxes
		/*driver.findElement(By.xpath("//a[@href=\'/checkboxes\']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();*/
		
		//Broken Images
	/*	driver.findElement(By.xpath("//a[@href=\'/broken_images\']")).click();
		List<WebElement>images=driver.findElements(By.xpath("//h3[contains(text(), 'Broken Images')]"));
		
		 for (WebElement image : images) {
	            String imageSrc = image.getAttribute("src");
	            System.out.println(imageSrc);
	        }
		 int totalImages = images.size();
	        
	        // Print the total number of images
	        System.out.println("Total number of images on the page: " + totalImages);*/
		
			//challenging DOM
			/*driver.findElement(By.xpath("//a[@href=\'/challenging_dom\']")).click();
			driver.findElement(By.xpath("//td[normalize-space(text())='Phaedrum0']")).click();  */
		
			//CONTEXT MENU
			driver.findElement(By.xpath("//a[@href=\'/context_menu\']")).click();
			WebElement button=driver.findElement(By.id("hot-spot"));
			Actions act=new Actions(driver);
			//act.contextClick(button).build().perform();
			act.contextClick(button).perform();
			 //Thread.sleep(2000);
			 Robot robot = new Robot();
		
	}

	}

