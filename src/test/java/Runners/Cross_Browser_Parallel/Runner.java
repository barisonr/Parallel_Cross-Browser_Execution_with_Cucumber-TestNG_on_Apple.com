package Runners.Cross_Browser_Parallel;

import Utils.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;


@CucumberOptions(
        features = {"src/test/resources/Features/"},
        glue = {"Steps"}
)

public class Runner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

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
