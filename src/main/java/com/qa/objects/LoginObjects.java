package com.qa.objects;
import org.openqa.selenium.By;

public class LoginObjects {
    public By userEmail1(String abc){
        By.xpath("userEmail");
        return userEmail1(abc);
    }

    public By userEmail(){
        return By.id("userEmail");
    }

    public By userPassword(){
        return By.id("userPassword");
    }

    public By submit(){
        return By.id("login");
    }

}
