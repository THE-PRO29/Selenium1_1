package Railway;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.Utilities;
import Constant.Constant;

public class RegisterTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath() + "\\Executables\\chromedriver.exe");
        Constant.WebDriver = new ChromeDriver();
        Constant.WebDriver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");

        Constant.WebDriver.quit();
    }

    @Test
    public void TC02(){
        System.out.println("TC02 - User can register an Railway account");
        HomePage homePage = new HomePage();
        homePage.open();

        RegisterPage registerPage = homePage.gotoRegisterPage();
        String actualMsg = registerPage.register(Constant.USERNAME, Constant.PASSWORD, Constant.CONFIRMPASSWORD, Constant.PID).getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
}
