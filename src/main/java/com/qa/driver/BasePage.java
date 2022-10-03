package com.qa.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BasePage {
    protected WebDriver driver;

    @Parameters ({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional ("chrome") String browser) {
        // Init WebDriver
        BrowserDriverFactory factory = new BrowserDriverFactory(browser);
        driver = factory.createDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}
