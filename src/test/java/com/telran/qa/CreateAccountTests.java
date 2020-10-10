package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    //user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isSingUpTabPresentInHeader()) {
            LogOut();
        }
    }

    @Test
    //click on signUp button

//click submit button


    public void testSignUp(){
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
        //fill registration form

        type(By.cssSelector("#first_name"), "MA");
        type(By.cssSelector("#second_name"),"SHA");
        type(By.cssSelector("#email"),"foxqa25-3@qa.co");
        type(By.cssSelector("#password"),"FoXfOxFoX1");

        click(By.cssSelector("#check_policy"));
        //click submit button
        submitForm();
        //check,login form displayed
        Assert.assertTrue(isLoginFromPresent());
    }


    }



