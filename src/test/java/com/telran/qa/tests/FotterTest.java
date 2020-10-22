package com.telran.qa.tests;

import com.telran.qa.FW.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FotterTest extends TestBase {
    @BeforeMethod
    public void findElementSearch(){
      //  System.out.println(""+ app.getFooter().isPresentElementTermsOfUse());
        System.out.println(""+ app.getFooter().isPresentElementLetTheCarWork());
        System.out.println(""+ app.getFooter().isPresentElementSearch2());


    }
    @Test
    public void testFotter() throws InterruptedException {
        app.getUser().jumpToFooter();
        Thread.sleep(2000);
       // app.getFooter().click(By.cssSelector("[href='/terms']"));
        app.getFooter().click(By.cssSelector("[href='/car']"));
        app.getFooter().click(By.cssSelector("[href='/search']"));

    }

}
