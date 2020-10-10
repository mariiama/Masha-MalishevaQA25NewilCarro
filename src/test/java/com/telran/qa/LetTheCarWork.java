package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetTheCarWork extends TestBase {
    @BeforeMethod
    public void ensurePriconditions(){
        isPresentElementLetTheCar();
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
    }
    @Test
    public void testFromLetTheCar(){
        type(By.cssSelector("name='country'"),"Israel");
        type(By.cssSelector(".address"),"Jerusalem Street");
        type(By.cssSelector(".distance_included"),"500");
        type(By.cssSelector(".serial_number"),"130902");
        type(By.cssSelector(".brand"),"Mazda");
        type(By.cssSelector(".model"),"CX-9");
        type(By.cssSelector(".year"),"2016");
        type(By.cssSelector(".engine"),"2,5");
        type(By.cssSelector(".fuel_consumption"),"8");
        type(By.cssSelector(".fuel"),"petrol");
        type(By.cssSelector(".transmition"),"automatic");
        type(By.cssSelector(".wd"),"four-wheel drive");
        type(By.cssSelector(".horsepower"),"231");
        type(By.cssSelector(".torque"),"5000");
        type(By.cssSelector(".doors"),"5");
        type(By.cssSelector(".seats"),"7");
        type(By.cssSelector(".class"),"A");
        type(By.cssSelector("[name='about']"),"Crossover manufactured by the Japanese automobile company Mazda");
        type(By.cssSelector(".type_feature"),"Car,category A");
        type(By.cssSelector(".price"),"300");

        submitForm();
    }
}
