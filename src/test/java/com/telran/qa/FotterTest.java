package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FotterTest extends TestBase {
    @BeforeMethod
    public void findElementSearch(){
       // System.out.println(""+ isPresentElementTermsOfUse());
        System.out.println(""+ isPresentElementLetTheCarWork());
        System.out.println(""+ isPresentElementSearch2());


    }
    @Test
    public void testFotter(){
        click(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
        click(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
        click(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]"));

    }

}
