package com.qa.pages;

import com.qa.AbstractComponent.AbstractComponent;
import com.qa.objects.LoginObjects;
import com.qa.utils.DriverUtils;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractComponent {
    WebDriver driver;
    LoginObjects loginObjects = new LoginObjects();

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void SignIn(String username, String password) {
        DriverUtils.enterText(driver, loginObjects.userEmail(), username);
        DriverUtils.enterText(driver, loginObjects.userPassword(), password);
        DriverUtils.click(driver, loginObjects.submit());
    }

//    public void goTo(String url) {
//        DriverUtils.GoToUrl(driver, url);
//    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client");
    }

    public void inputUsername(String username) {
        DriverUtils.enterText(driver, loginObjects.userEmail(), username);
    }

    public void inputPassword(String password) {
        DriverUtils.enterText(driver, loginObjects.userPassword(), password);
    }

    public void clickSignIn() {
        DriverUtils.click(driver, loginObjects.submit());
    }


}
