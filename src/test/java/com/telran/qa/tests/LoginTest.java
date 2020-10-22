package com.telran.qa.tests;

import com.telran.qa.FW.TestBase;
import com.telran.qa.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getUser().isLoginFromPresent()) {
            if (app.getUser().isUserLoggedIn()) {
                app.getUser().LogOut();
            }
            app.getHeader().clickLoginTabOnHeader();
        }
    }
    @Test
    public void positiveLoginUserTest() {
        //click(By.cssSelector(""));
        app.getUser().FillLoginForm(new User().withEmail("foxqa25-3@qa.co").withPassword("FoXfOxFoX1"));

        //app.getUser().submitForm();
        //Assert.assertTrue(app.getHeader().isSingUpTabPresentInHeader());
        //String email = app.getHeader().getEmailTextFromHeader();
        //System.out.println(email);
        //Assert.assertEquals(email, "foxqa25-3@qa.co");
    }
    @Test
    public void negativeLoginUserTest(){
        app.getUser().FillLoginForm(new User().withEmail("foxqa25-3@qa.co").withPassword(""));
       // app.getUser().submitForm();
    }

}





