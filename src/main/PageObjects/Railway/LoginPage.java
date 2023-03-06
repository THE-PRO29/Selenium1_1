package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{
    //Locators
    private final By _txtUsername = By.xpath("//input[@id='username']");
    private final By _txtPassword = By.xpath("//input[@id='password']");
    private final By _btnLogin = By.xpath("//input[@value='login']");
    private final By _lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

    //Elements
    public WebElement getTxtUsername()
    {
        return Constant.WebDriver.findElement(_txtUsername);
    }

    public WebElement getTxtPassword()
    {
        return Constant.WebDriver.findElement(_txtPassword);
    }

    public WebElement getBtnLogin()
    {
        return Constant.WebDriver.findElement(_btnLogin);
    }

    public WebElement getLblLoginErrorMsg()
    {
        return Constant.WebDriver.findElement(_lblLoginErrorMsg);
    }

    //Methods
    public HomePage login(String username, String password)
    {
        //Submit login credentials
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        //Land on Home page
        return new HomePage();
    }
}
