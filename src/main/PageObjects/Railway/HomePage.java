package Railway;
import Constant.Constant;

public class HomePage extends GeneralPage{
    //Locator
    //Elements
    //Methods
    public HomePage open()
    {
        Constant.WebDriver.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
