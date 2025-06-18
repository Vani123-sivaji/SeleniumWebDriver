package HybridFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	//constructor
		LoginPage2(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);//Mandatory
		}
		
	//Locators
		
		@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
		WebElement txt_username;
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement txt_password;
		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement btn_login;
		
		@FindBy(tagName="a")
		List<WebElement> links;
		
	//Action Methods
		
		public void setusername(String user)
		{
			txt_username.sendKeys(user);
		}
		
		
		public void setpassword(String pwd)
		{
			 txt_password.sendKeys(pwd);
		}
		
		public void clicklogin()
		{
			 btn_login.click();
		}
		

	}


