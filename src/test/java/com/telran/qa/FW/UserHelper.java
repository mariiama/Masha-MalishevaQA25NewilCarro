package com.telran.qa.FW;

import com.telran.qa.FW.HelperBase;
import com.telran.qa.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isLoginFromPresent(){
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void LogOut() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'LogOut')]"));
    }

    // Headers
    public boolean isPresentElementLogIn(){
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public void LogIn(){
        FillLoginForm(new User().withEmail("foxqa25-3@qa.co").withPassword("FoXfOxFoX1"));
        submitForm();
    }

    public void FillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
        //type(By.name("email"),"foxqa25-3@qa.co");
        //type(By.name("password"),"FoXfOxFoX1");
    }


    public void selectPolicyCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public boolean isRegistrationFormOpened() {
        return isElementPresent(By.cssSelector("form.signup__fields"));
    }

    public void fillRegistrationForm(User user) {
        //test only email + password
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }
}
