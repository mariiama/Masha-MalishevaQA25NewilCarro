package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    static WebDriver wd;
    UserHelper user;
    CarHelper car;
    HeaderHelper header;
    FooterHelper footer;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
        user = new UserHelper(wd);
        car = new CarHelper(wd);
        header = new HeaderHelper(wd);
        footer = new FooterHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public CarHelper getCar() {
        return car;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public FooterHelper getFooter() {
        return footer;
    }
}
