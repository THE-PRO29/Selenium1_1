package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class RegisterPage extends GeneralPage{
    private final By _txtUsername = By.xpath("//input[@id='email']");
    private final By _txtPassword = By.xpath("//input[@id='password']");
    private final By _txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By _txtPid = By.xpath("//input[@id='pid']");
    private final By _btnRegister = By.xpath("//input[@value='Register']");
    private final By _lblRegisterErrorMsg = By.xpath("//p[@class='message error']");

    public WebElement getTxtUsername()
    {
        return Constant.WebDriver.findElement(_txtUsername);
    }

    public WebElement getTxtPassword()
    {
        return Constant.WebDriver.findElement(_txtPassword);
    }

    public WebElement getTxtConfirmPassword()
    {
        return Constant.WebDriver.findElement(_txtConfirmPassword);
    }

    public WebElement getTxtPid()
    {
        return Constant.WebDriver.findElement(_txtPid);
    }

    public WebElement getBtnRegister()
    {
        return Constant.WebDriver.findElement(_btnRegister);
    }

    public WebElement getLblRegisterErrorMsg()
    {
        return Constant.WebDriver.findElement(_lblRegisterErrorMsg);
    }

    public HomePage register(String username, String password, String confirmPassword, String pid)
    {
        //Submit login credentials
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getTxtPid().sendKeys(pid);
        this.getBtnRegister().click();
        //Land on Home page
        return new HomePage();
    }
}
