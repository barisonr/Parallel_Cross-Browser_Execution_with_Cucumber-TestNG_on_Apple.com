package Pages.ProductPages;

import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iPad_Air {
    public iPad_Air() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "a[aria-label='Buy iPad Air']")
    public WebElement buyiPadAir;
}
