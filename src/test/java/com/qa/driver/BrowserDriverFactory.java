package com.qa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriverFactory {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;

    public BrowserDriverFactory(String browser) {
        this.browser = browser.toLowerCase();
    }

    public WebDriver createDriver() {
        // Create driver
        switch (browser) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver());
            }
            case "firefox" -> {
                System.out.println("pending");
            }
        }

        return driver.get();
    }
}
