package com.telran.qa;

import org.testng.annotations.BeforeMethod;

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

}





