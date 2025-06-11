package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Signup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Your WebDriver setup here

        driver.get("https://demo.automationtesting.in/Register.html");

        // Wait for the dropdown to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement skillsDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("Skills")));

        // Scroll into view if needed
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", skillsDropdown);

        // Use Select class to choose the option
        Select select = new Select(skillsDropdown);
        select.selectByVisibleText("Adobe Photoshop");

        // Optional: verify selection
        String selected = select.getFirstSelectedOption().getText();
        System.out.println("Selected option: " + selected);
    }
}
