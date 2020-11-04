package com.telran.qa.tests;

import com.telran.qa.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateAccountTests extends TestBase {
    //user shoud be logged out


    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getHeader().isSingUpTabPresentInHeader()) {
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
        app.getUser().selectPolicyCheckBox();
        app.getUser().pausa(3000);
        app.getUser().submitForm();

    }

    @Test

    public void negativeTestSignUpPassword() throws InterruptedException {
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

    @Test(dataProvider = "validUser", dataProviderClass = DataProviders.class)
    public void testSignUpFromDataProvider(
            String fName, String lName, String email, String password) throws InterruptedException {
        app.getHeader().openRegistationFormFromHeader();
        Assert.assertTrue(app.getUser().isRegistrationFormOpened());
        app.getUser().fillRegistrationForm(new User()
                .withFirstName(fName)
                .withSecondName(lName)
                .withEmail(email)
                .withPassword(password));
        app.getUser().selectPolicyCheckBox();
        app.getUser().pausa(3000);
        //click submit button
        app.getUser().submitForm();

        logger.info("Login form present. actual result: " + app.getUser().isLoginFromPresent()
                + " expected result is: true ");
        //check, login form displayed
       // Assert.assertTrue(app.getUser().isLoginFromPresent());
    }


 @Test(dataProvider = "validUserFromCSV", dataProviderClass = DataProviders.class)
    public void testSignUpFromCSV(User user) throws InterruptedException {
        app.getHeader().openRegistationFormFromHeader();
        //Assert.assertTrue(app.getUser().isRegistrationFormOpened());
        app.getUser().fillRegistrationForm(new User());
         app.getUser().selectPolicyCheckBox();
        app.getUser().pausa(3000);
        //click submit button
        app.getUser().submitForm();

        logger.info("Login form present. actual result: "+ app.getUser().isLoginFromPresent()
                + " expected result is: true ");
      /*  //check, login form displayed
        Assert.assertTrue(app.getUser().isLoginFromPresent());
*/
    }
}

