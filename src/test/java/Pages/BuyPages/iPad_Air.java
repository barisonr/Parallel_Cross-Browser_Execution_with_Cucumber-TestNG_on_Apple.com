package Pages.BuyPages;

import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iPad_Air {
    public iPad_Air() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "input[value='space_gray'] + label")
    public WebElement space_gray;

    @FindBy(css = "input[value='pink'] + label")
    public WebElement pink;

    @FindBy(css = "input[value='purple'] + label")
    public WebElement purple;

    @FindBy(css = "input[value='blue'] + label")
    public WebElement blue;

    @FindBy(css = "input[value='starlight'] + label")
    public WebElement starlight;

    @FindBy(css = "img[alt*='Space Gray']")
    public WebElement imageSpaceGray;

    @FindBy(css = "img[alt*='Pink']")
    public WebElement imagePink;

    @FindBy(css = "img[alt*='Purple']")
    public WebElement imagePurple;

    @FindBy(css = "img[alt*='Blue']")
    public WebElement imageBlue;

    @FindBy(css = "img[alt*='Starlight']")
    public WebElement imageStarlight;

    @FindBy(id = "as-standardnav-sticky-placeholder")
    public WebElement stickyNavigation;
}
