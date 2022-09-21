package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before // To run feature files
    public static void before() {
        DriverManager.setupDriver("chrome");
    }

    @After // To run feature files
    public static void after() {
        DriverManager.quitDriver();
    }
}