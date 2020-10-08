package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OpenHomePageTest
{
    WebDriver wd;
    @BeforeMethod
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }
    @Test
    public void homePageTest()
    {
        System.out.println("site opened!");
       // wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
        System.out.println("FindCarForm : " + isFindCarFormPresent());
        isFindCarFormPresent2();
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

    @AfterMethod
    public void tearDown()
    {
        wd.quit();
    }
}
