package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverUtils {

    WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static WebElement waitForVisibility(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void enterText(WebDriver driver, By by, String text) {
        WebElement elm = waitForVisibility(driver, by);
        elm.sendKeys(text);
    }

    public static void click(WebDriver driver, By by) {
        WebElement elm = waitForVisibility(driver, by);
        elm.click();
    }


}
