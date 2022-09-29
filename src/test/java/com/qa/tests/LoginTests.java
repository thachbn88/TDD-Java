package com.qa.tests;

import com.qa.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTests {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://rahulshettyacademy.com/client/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login("anshika@gmail.com", "Iamking@000");
    }

    @Test
    public void Success(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://rahulshettyacademy.com/client/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.SignIn();
    }

}
