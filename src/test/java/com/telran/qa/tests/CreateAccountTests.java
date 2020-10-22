package com.telran.qa.tests;

import com.telran.qa.FW.TestBase;
import com.telran.qa.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!app.getHeader().isSingUpTabPresentInHeader()) {
            app.getUser().LogOut();
        }
    }


    @Test

    public void positiveTestSignUp() throws InterruptedException {
        app.getHeader().openRegistationFormFromHeader();
        Assert.assertTrue(app.getUser().isRegistrationFormOpened());

        app.getUser().fillRegistrationForm(new User()
                .withFirstName("SA")
                .withSecondName("SHA")
                .withEmail("sasha1308@gmail.com")
                .withPassword("13FoXfOxFoX"));
    }
    @Test

        public void negativeTestSignUpPassword () throws InterruptedException{
        app.getHeader().openRegistationFormFromHeader();
        Assert.assertTrue(app.getUser().isRegistrationFormOpened());
        app.getUser().fillRegistrationForm(new User()
        .withFirstName("MI")
        .withSecondName("SHA")
        .withEmail("foxqa25-5@qa.co"));


        app.getUser().selectPolicyCheckBox();
        app.getUser().pausa(3000);

        app.getUser().submitForm();

        Assert.assertFalse(app.getUser().isLoginFromPresent());
    }




    }






