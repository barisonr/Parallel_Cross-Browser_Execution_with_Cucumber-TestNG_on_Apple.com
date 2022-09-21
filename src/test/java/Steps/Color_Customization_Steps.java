package Steps;

import Pages.BuyPages.iPad_Air;
import Utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Color_Customization_Steps {
    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    iPad_Air iPad_Air = new iPad_Air();
    String product;
    String color;

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String page) {
        switch (page) {
            case "Buy iPhone 14 Pro" -> driver.get("https://www.apple.com/shop/buy-iphone/iphone-14-pro");

            case "Buy iPad Air" -> {
                driver.get("https://www.apple.com/shop/buy-ipad/ipad-air");
                product = "iPad Air";
            }
        }
    }

    @When("{string} is selected")
    public void colorIsSelected(String desiredColor) {
        color = desiredColor;

        if (product.equals("iPad Air")) {
            switch (color) {
                case "Space Gray" -> iPad_Air.space_gray.click();
                case "Pink" -> iPad_Air.pink.click();
                case "Purple" -> iPad_Air.purple.click();
                case "Blue" -> iPad_Air.blue.click();
                case "Starlight" -> iPad_Air.starlight.click();
            }
        }
    }

    @Then("product image should change")
    public void productImageShouldChange() {

        if (product.equals("iPad Air")) {
            switch (color) {
                case "Space Gray" -> {
                    waitVisibility(iPad_Air.imageSpaceGray);
                    Assert.assertTrue(iPad_Air.imageSpaceGray.isDisplayed());
                }
                case "Pink" -> {
                    waitVisibility(iPad_Air.imagePink);
                    Assert.assertTrue(iPad_Air.imagePink.isDisplayed());
                }
                case "Purple" -> {
                    waitVisibility(iPad_Air.imagePurple);
                    Assert.assertTrue(iPad_Air.imagePurple.isDisplayed());
                }
                case "Blue" -> {
                    waitVisibility(iPad_Air.imageBlue);
                    Assert.assertTrue(iPad_Air.imageBlue.isDisplayed());
                }
                case "Starlight" -> {
                    waitVisibility(iPad_Air.imageStarlight);
                    Assert.assertTrue(iPad_Air.imageStarlight.isDisplayed());
                }
            }
        }
    }

    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }
}
