package com.qa.pages;

import com.qa.driver.BasePage;
import com.qa.objects.LoginObjects;
import com.qa.utils.DriverUtils;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    LoginObjects loginObjects = new LoginObjects();

    public LoginPage(WebDriver driver) {
       this.driver = driver;
    }

    public void SignIn(String username, String password) {
        DriverUtils.enterText(driver, loginObjects.userEmail(), username);
        DriverUtils.enterText(driver, loginObjects.userPassword(), password);
        DriverUtils.click(driver, loginObjects.submit());
    }

    public void goTo(String url) {
        DriverUtils.GoToUrl(driver, url);
    }
}
