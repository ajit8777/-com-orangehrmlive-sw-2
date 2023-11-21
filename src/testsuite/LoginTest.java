package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * Enter “Admin” username
 * Enter “admin123 password
 * Click on ‘LOGIN’ button
 * Verify the ‘Dashboard’ text is display
 */

public class LoginTest extends BaseTest {

    // Launch baseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify the ‘Dashboard’ text is display
        String expectedText = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("dashboard text not found", expectedText, actualText);

    }

    @After
    public void close() {
        closeBrowser();
    }
}
