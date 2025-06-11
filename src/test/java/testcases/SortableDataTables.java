package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortableDataTables {
@Test
public void SortableDataTables() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Sortable Data Tables')]")).click();
	
	// No of Rows in a webtable		
	int rows=driver.findElements(By.xpath("//table[@id='table1']")).size();
	System.out.println("Number of rows in a table:" +rows);
	
	// No of columns in a webtable	
	int columns=driver.findElements(By.xpath("//table[@id='table1']")).size();
	System.out.println("Number of columns in a table:" +columns);
	
	
	// Get the specific row or column data 
	
	String value=driver.findElement(By.xpath("//table[@id='table1']")).getText();
	System.out.println("Spefic value of rows in a table:" +value);
	
	Thread.sleep(2000);
			
//----------Example2 Table
	
	// No of Rows in a webtable		
		int rows1=driver.findElements(By.xpath("//table[@id='table2']")).size();
		System.out.println("Number of rows in a table2:" +rows1);
		
		// No of columns in a webtable	
		int columns1=driver.findElements(By.xpath("//table[@id='table2']")).size();
		System.out.println("Number of columns in a table2:" +columns1);
		
		
		// Get the specific row or column data 
		
		String value1=driver.findElement(By.xpath("//table[@id='table2']")).getText();
		System.out.println("Spefic value of rows in a table2:" +value1);
	
	
}
}