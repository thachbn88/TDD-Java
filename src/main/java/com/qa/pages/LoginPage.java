package com.qa.pages;

import com.qa.objects.LoginObjects;
import com.qa.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    LoginObjects loginObjects = new LoginObjects();
    public LoginPage(WebDriver driver) {
        //init driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElement email = driver.findElement(By.id("userEmail"));
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPass;

    @FindBy(id = "login")
    WebElement submit;

    public void login(String email, String pass) {
        userEmail.sendKeys(email);
        userPass.sendKeys(pass);
        submit.click();
    }

    public void SignIn(){
        DriverUtils.enterText(driver,loginObjects.userEmail(), "anshika@gmail.com");
        DriverUtils.enterText(driver,loginObjects.userPassword(), "Iamking@000");
        DriverUtils.click(driver,loginObjects.submit());
    }
    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client/");
    }
}
