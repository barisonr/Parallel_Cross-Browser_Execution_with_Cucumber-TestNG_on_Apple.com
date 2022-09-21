package Pages.ProductPages;

import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iPhone_14 {
    public iPhone_14() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "a[aria-label='Buy iPhone 14 Pro']")
    public WebElement buyiPhone14Pro;
}
