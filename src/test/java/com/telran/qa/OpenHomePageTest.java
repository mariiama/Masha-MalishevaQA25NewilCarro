package com.telran.qa;

import org.testng.annotations.Test;

public class OpenHomePageTest extends TestBase{
    @Test
    public void homePageTest()
    {
        System.out.println("site opened!");
       // wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
        System.out.println("FindCarForm : " + app.getCar().isFindCarFormPresent());
        app.getCar().isFindCarFormPresent2();
        app.getUser().jumpToFooter();
    }

}
