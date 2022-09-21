package Steps;

import Pages.ProductPages.M2_MacBook_Air;
import Pages.ProductPages.iPad_Air;
import Pages.ProductPages.iPhone_14;
import Utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WhichOneIsRightForYou_Steps {
    WebDriver driver = DriverManager.getDriver();
    iPhone_14 iPhone14ProPage = new iPhone_14();
    M2_MacBook_Air m2MacBookAirPage = new M2_MacBook_Air();
    iPad_Air iPadAirPage = new iPad_Air();

    @Given("an unregistered user is on the {string} product page")
    public void anUnregisteredUserOnThe(String productName) {
        switch (productName) {
            case "M2 MacBook Air" -> driver.get("https://www.apple.com/macbook-air-m2/");
            case "iPhone" -> driver.get("https://www.apple.com/iphone");
            case "iPad Air" -> driver.get("https://www.apple.com/ipad-air/");
        }
    }

    @When("click the Buy {string} in the {string}")
    public void clickingTheBuyInsideThe(String productName, String section) {
        switch (productName) {
            case "M2 MacBook Air" -> m2MacBookAirPage.buyM2MacBookAir.click();
            case "iPhone 14 Pro" -> iPhone14ProPage.buyiPhone14Pro.click();
            case "iPad Air" -> iPadAirPage.buyiPadAir.click();
        }
    }

    @Then("the {string} page should open")
    public void thePageShouldOpen(String pageName) {
        switch (pageName) {
            case "Choose your new MacBook Air" ->
                    Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-mac/macbook-air/with-m2-chip");

            case "Buy iPhone 14 Pro" ->
                    Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-iphone/iphone-14-pro");

            case "Buy iPad Air" ->
                    Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-ipad/ipad-air");
        }
    }
}
