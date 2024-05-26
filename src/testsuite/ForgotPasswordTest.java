package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfull
 * y
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";      //Base url

    @Before
    public void setUp() {                       //Browser open code
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {          //Navigate to forget password page test
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();       //Click on forget password link
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();       //Getting actual text
        Assert.assertEquals("User not navigated to forget password page.", expectedText, actualText);        //Comparing 2 strings
    }

    @After
    public void tearDown() {                    //Browser closing code
        closeBrowser();
    }
}
