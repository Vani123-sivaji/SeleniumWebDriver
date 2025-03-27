package testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LargeandDeepDOM {
@Test(priority=1)
public void dom()
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Large & Deep DOM')]")).click();
	
	Set<String>windowIds=driver.getWindowHandles();
	
	 Iterator<String>it=windowIds.iterator();
	 String parentId=it.next();// first window Id
	 String childwindowid=it.next();// Child window ID
	 System.out.println("parentId::::::::::"+parentId);
	 System.out.println("childwindowid::::::::::"+childwindowid);
}

@Test(priority=2)
	public void multiplewindows()
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
	
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		//-BY using List get the window Id's
		   Set<String>windowIds=driver.getWindowHandles();
		   List<String>windowIDlist=new ArrayList(windowIds);//converting set to list 
		   String paremtwindowID= windowIDlist.get(0);//first window ID
		   String childwindowID= windowIDlist.get(1);//Second window ID
		   System.out.println("Parent window ID::::::::"+paremtwindowID);
		   System.out.println("ChildwindowID:::::::::::"+childwindowID);
		
	
	
	
	
	
	
	
	
	
}	
}
