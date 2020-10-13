package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
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
    //click(By.cssSelector("Pinas!"));
        FillLoginForm(new User().withEmail("foxqa25-3@qa.co").withPassword("FoXfOxFoX1"));

        submitForm();
        Assert.assertTrue(isSingUpTabPresentInHeader());
        String email = wd.findElement(By.cssSelector("[href='/account']")).getText();
        System.out.println(email);
        Assert.assertEquals(email, "foxqa25-3@qa.co");
    }

    public void FillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
        //type(By.name("email"),"foxqa25-3@qa.co");
        //type(By.name("password"),"FoXfOxFoX1");
    }

}
