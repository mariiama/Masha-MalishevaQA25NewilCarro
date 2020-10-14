package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterHelper extends HelperBase{
    public FooterHelper(WebDriver wd) {
        super(wd);
    }

    //Fotters
    public boolean isPresentElementTermsOfUse(){
        return isElementPresent(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
    }

    public boolean isPresentElementLetTheCarWork(){
        return isElementPresent(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
    }

    public boolean isPresentElementSearch2(){
        return isElementPresent(By.xpath("//footer/section[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
    }
}
