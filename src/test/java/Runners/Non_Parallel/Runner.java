package Runners.Non_Parallel;

import Utils.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


@CucumberOptions(
        features = {"src/test/resources/Features/"},
        glue = {"Steps"}
)

public class Runner extends AbstractTestNGCucumberTests {

    @Parameters("browser")
    @BeforeMethod
    public void before(String browser) {
        DriverManager.setupDriver(browser);
    }

    @AfterMethod
    public void after() {
        DriverManager.quitDriver();
    }
}
