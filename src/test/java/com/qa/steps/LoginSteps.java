package com.qa.steps;

import com.qa.driver.BasePage;
import com.qa.driver.BaseTest;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginSteps extends BaseTest {

    public LoginPage loginPage;

//    @Given("I go to the site")
//    public void test() throws IOException
//    {
//        loginPage = launchApplication();
//    }

    @Given("Open site")
    public void openSite() throws IOException{
        loginPage = launchApplication();
    }

//    @Given("^I go to the site (.+)$")
//    public void OpenSite(String url) throws IOException{
//       loginPage = launchApplication(url);
//    }

    @When("^I enter username (.+)$")
    public void iEnterUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("^I input name (.+)$")
    public void iInputName(String username) {
        loginPage.inputUsername(username);
    }
//
//    @And("^I enter password (.+)$")
//    public void iEnterPassword(String password) {
//        loginPage.inputPassword(password);
//    }
//
//    @And("I click signIn")
//    public void iClickSignIn() {
//        loginPage.clickSignIn();
//    }

}
