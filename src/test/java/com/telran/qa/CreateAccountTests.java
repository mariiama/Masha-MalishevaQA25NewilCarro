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

       // fillRegistrationForm(new User("MA", "SHA", "foxqa25-4@qa.co", "FoXfOxFoX1"));
        fillRegistrationForm(new User()
                .withFirstName("SA")
                .withSecondName("SHA")
                .withEmail("sasha1308@gmail.com")
                .withPassword("13FoXfOxFoX"));

        //user not have password
        fillRegistrationForm(new User()
        .withFirstName("MI")
        .withSecondName("SHA")
        .withEmail("foxqa25-5@qa.co"));
       // .withPassword("fOxFoXfOx2"));


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


    public void fillRegistrationForm(User user) {
        //test only email + password
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }


}



