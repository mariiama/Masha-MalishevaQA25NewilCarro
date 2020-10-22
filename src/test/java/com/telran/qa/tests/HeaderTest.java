package com.telran.qa.tests;

import com.telran.qa.FW.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends TestBase {

    @BeforeMethod
    public void findElementSearch(){
        System.out.println(""+ app.getUser().isPresentElementLogIn());
        System.out.println("" + app.getHeader().isPresentElementSingUp());
        System.out.println("" + app.getHeader().isPresentElementLetTheCar());
        System.out.println(""+ app.getHeader().isPresentElementSearch());

    }
    @Test
    public void testHeader(){
        app.getUser().click(By.cssSelector("[href='/login']"));
        app.getHeader().openRegistationFormFromHeader();
        app.getUser().click(By.xpath("//header/section[1]/ul[1]/li[1]/a[1]"));
        app.getHeader().openAddCarFormHeader();

    }
}
