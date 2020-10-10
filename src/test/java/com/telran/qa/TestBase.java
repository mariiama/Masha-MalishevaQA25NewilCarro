package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
   static WebDriver wd;

    @BeforeSuite
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    public boolean isElementPresent (By locator)
    {
        return wd.findElements(locator).size()>0;
    }

    public boolean isFindCarFormPresent()
    {
        //поиск элементов
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public boolean isFindCarFormPresent2()
    {
        try
        {
            wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
            return true;
        }
        catch (NoSuchElementException ex)
        {
            return false;
        }
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

    public boolean isFindCarFromPresent2()
    {
        return isElementPresent2 (By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    @AfterSuite(enabled = false)
    public void tearDown()
    {
        wd.quit();
    }

    public boolean isLoginFromPresent(){
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }
    public void submitForm() {
        new WebDriverWait(wd,15).until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("[type='submit']"))).click();
        //click(By.cssSelector("[type='submit']"));
    }

    public boolean isSingUpTabPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void LogOut() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void clickLoginTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'LogOut')]"));
    }
    // Headers
    public boolean isPresentElementLogIn(){
        return wd.findElements(By.cssSelector("[href='/login']")).size()>0;
    }
    public boolean isPresentElementSingUp(){
        try {
            wd.findElements(By.cssSelector("[href='/signup']"));
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }
    }
    public boolean isPresentElementLetTheCar(){
        return wd.findElements(By.xpath(" //header/section[1]/ul[1]/li[1]/a[1]")).size()>0;
    }
    public boolean isPresentElementSearch(){
        try {
            wd.findElement(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
            return true;
        }
        catch (NoSuchElementException ex){
            return false;
        }
    }
    //Fotters
    public boolean isPresentElementTermsOfUse(){
        return wd.findElements(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]")).size()>0;
    }
    public boolean isPresentElementLetTheCarWork(){
        return wd.findElements(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]")).size()>0;
    }
    public boolean isPresentElementSearch2(){
        return wd.findElements(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]")).size()>0;
    }
    //LetCar


}
