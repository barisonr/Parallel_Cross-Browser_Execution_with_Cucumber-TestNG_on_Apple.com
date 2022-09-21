package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.logging.Level;
import java.util.logging.Logger;


public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setupDriver(String browser) {

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "OFF");

        if (browser.equals("firefox")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            WebDriverManager.firefoxdriver().setup();
            DriverManager.driver.set(new FirefoxDriver());
        } else {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            WebDriverManager.chromedriver().setup();
            DriverManager.driver.set(new ChromeDriver());
        }

        DriverManager.getDriver().manage().deleteAllCookies();
        DriverManager.getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        driver.get().quit();
    }
}
