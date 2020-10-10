package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isLoginFromPresent()){
            if(isUserLoggedIn()){
                LogOut();
            }
            clickLoginTabOnHeader();
        }
    }

    @Test
    public void loginUserTest(){
    //click(By.cssSelector(""));
    type(By.name("email"),"foxqa25-3@qa.co");
    type(By.name("password"),"FoXfOxFoX1");
    submitForm();
    }

}
