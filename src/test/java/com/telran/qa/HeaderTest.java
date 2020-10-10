package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends TestBase {

    @BeforeMethod
    public void findElementSearch(){
        System.out.println(""+ isPresentElementLogIn());
        System.out.println("" + isPresentElementSingUp());
        System.out.println("" + isPresentElementLetTheCar());
        System.out.println(""+ isPresentElementSearch());

    }
    @Test
    public void testHeader(){
        click(By.cssSelector("[href='/login']"));
        click(By.cssSelector("[href='/signup']"));
        click(By.xpath("//header/section[1]/ul[1]/li[1]/a[1]"));
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));

    }
}
