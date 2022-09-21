package Pages.ProductPages;

import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M2_MacBook_Air {
    public M2_MacBook_Air() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "a[aria-label='Buy M2 MacBook Air']")
    public WebElement buyM2MacBookAir;
}
