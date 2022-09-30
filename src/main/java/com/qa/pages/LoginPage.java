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

    public void SignIn() {
        DriverUtils.enterText(driver, loginObjects.userEmail(), "anshika@gmail.com");
        DriverUtils.enterText(driver, loginObjects.userPassword(), "Iamking@000");
        DriverUtils.click(driver, loginObjects.submit());
    }

    public void goTo(String url) {
        DriverUtils.GoToUrl(driver, url);
    }
}
