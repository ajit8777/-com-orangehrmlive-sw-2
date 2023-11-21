package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    // Launching baseUrl
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        // Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Reset Password text not found", expectedText, actualText);

    }

    @After
    public void close() {
        closeBrowser();
    }
}