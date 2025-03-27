package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1)To open the chrome browser
		
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		//2)Launch the url on the browser
		driver.get("https://the-internet.herokuapp.com/");
		
		
		
		//3)Validate the Title of the page
		
		String act_gettitle=driver.getTitle();
		if(act_gettitle.equals("The Internet"))
		{
			System.out.println("Test Passed");
		
		}
		else
		{
			System.out.println("Test Failed");
				
		}
		
		//4)To close the browser
		
		driver.close();
}
}
