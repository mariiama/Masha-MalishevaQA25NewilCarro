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
    public void testSignUp() throws InterruptedException {
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
        //fill registration form

        fillRegistrationForm("MA", "SHA", "foxqa25-4@qa.co", "FoXfOxFoX1");
        fillRegistrationForm("SA","SHA","sasha1308@gmail.com","13FoXfOxFoX");

        click(By.cssSelector("#check_policy"));
        pausa(3000);

        //click submit button
        submitForm();
        //check,login form displayed
        Assert.assertTrue(isLoginFromPresent());
    }

    public void pausa(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }


    public void fillRegistrationForm(String firstName, String secondName, String email, String password) {
        type(By.cssSelector("#first_name"), firstName);
        type(By.cssSelector("#second_name"), secondName);
        type(By.cssSelector("#email"), email);
        type(By.cssSelector("#password"), password);
    }


}



