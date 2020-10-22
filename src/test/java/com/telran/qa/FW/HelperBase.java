package com.telran.qa.FW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class HelperBase {
    static WebDriver wd;

    public HelperBase(WebDriver wd) {

        this.wd = wd;
    }

    public HelperBase() {

    }

    public boolean isElementPresent (By locator)
    {
        return wd.findElements(locator).size()>0;
    }

    public boolean isElementPresent2(By by) {
       try {
   wd.findElements(by);
  return true;
  }
  catch (NoSuchElementException ex)
  { return false;
      }
  }

    public void type(By locator, String text) {
        if(text != null) {
            click(locator);
            wd.findElement(locator).click();
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    public void submitForm() {
        new WebDriverWait(wd,15).until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("[type='submit']"))).click();
        //click(By.cssSelector("[type='submit']"));
    }

    public void pausa(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void jumpToFooter(){
        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
    }
}