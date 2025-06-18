package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;

@Epic("User Authentication")
@Feature("Login")
public class FirstTestCase {

    WebDriver driver;

    @BeforeMethod
    @Step("Open the application")
    public void openApp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the Login Page")
    @Story("Story: To check Login Page")
    public void login() {
        clickSignupLogin();
        enterSignupDetails("vani", "vanisivaji@gmail.com");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register a new user")
    @Story("Story: Register flow")
    public void register() {
        fillRegistrationForm();
    }

    @AfterMethod
    @Step("Close the browser")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ---------- Allure Step Wrappers -----------

    @Step("Click Signup/Login link")
    public void clickSignupLogin() {
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
    }

    @Step("Enter signup details: Name = {name}, Email = {email}")
    public void enterSignupDetails(String name, String email) {
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("SAI");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("SAI@GMAIL.COM");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
    }

    @Step("Fill the registration form")
    public void fillRegistrationForm() {
     //   driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("//input[@id='firstpassword']")).sendKeys("vani@123");

        driver.findElement(By.xpath("//select[@id='days']/option[@value='4']")).click();
        driver.findElement(By.xpath("//select[@id='months']/option[normalize-space()='March']")).click();
        driver.findElement(By.xpath("//select[@id='years']/option[@value='2020']")).click();

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("first_name")).sendKeys("Vani");
        driver.findElement(By.id("last_name")).sendKeys("G");
        driver.findElement(By.id("company")).sendKeys("Admin");
        driver.findElement(By.id("address1")).sendKeys("MRPALLI");
        driver.findElement(By.id("address2")).sendKeys("Tirupati");
        driver.findElement(By.xpath("//select[@id='country']/option[@value='India']")).click();

        driver.findElement(By.id("state")).sendKeys("AP");
        driver.findElement(By.id("city")).sendKeys("TIRUPATI");
        driver.findElement(By.id("zipcode")).sendKeys("517502");
        driver.findElement(By.id("mobile_number")).sendKeys("1234567654");
        driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
        
        
    }
}
