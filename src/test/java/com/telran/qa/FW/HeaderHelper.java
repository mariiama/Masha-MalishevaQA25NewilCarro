package com.telran.qa.FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isSingUpTabPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void clickLoginTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isPresentElementSingUp(){
        return isElementPresent2(By.cssSelector("[href='/signup']"));
    }

    public boolean isPresentElementLetTheCar(){
        return isElementPresent(By.xpath(" //header/section[1]/ul[1]/li[1]/a[1]"));
    }

    public boolean isPresentElementSearch(){
        try {
            ApplicationManager.wd.findElement(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
            return true;
        }
        catch (NoSuchElementException ex){
            return false;
        }
    }

    public String getEmailTextFromHeader() {
        return ApplicationManager.wd.findElement(By.cssSelector("[href='/account']")).getText();
    }

    public void openRegistationFormFromHeader() {
        click(By.cssSelector("[href='/signup']"));
    }
    public void openAddCarFormHeader() {
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
    }
}
