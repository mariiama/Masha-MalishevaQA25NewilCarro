package com.telran.qa.FW;

import com.telran.qa.models.NewCar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase {
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isFindCarFormPresent()
    {
        //поиск элементов
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public boolean isFindCarFormPresent2()
    {
        return isElementPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public boolean isFindCarFromPresent2()
    {
        return isElementPresent2 (By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

   // public void openAddCarFormHeader() {
     //   click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
    //}

    public void filleRegistrationFormCar(NewCar newCar) {
        type(By.cssSelector(".country"), newCar.getCountry());
        type(By.cssSelector(".address"), newCar.getAddress());
        type(By.cssSelector(".distance_included"), newCar.getDistance_included());
        type(By.cssSelector(".serial_number"), newCar.getSerial_number());
        type(By.cssSelector(".brand"), newCar.getBrand());
        type(By.cssSelector(".model"), newCar.getModel());
        type(By.cssSelector(".year"), newCar.getYear());
        type(By.cssSelector(".engine"), newCar.getEngine());
        type(By.cssSelector(".fuel_consumption"), newCar.getFuel_consumption());
        type(By.cssSelector(".fuel"), newCar.getFuel());
        type(By.cssSelector(".transmition"), newCar.getTransmition());
        type(By.cssSelector(".wd"), newCar.getWd());
        type(By.cssSelector(".horsepower"), newCar.getHorsepower());
        type(By.cssSelector(".torque"), newCar.getTorque());
        type(By.cssSelector(".doors"), newCar.getDoors());
        type(By.cssSelector(".seats"), newCar.getSeats());
        type(By.cssSelector(".class"), newCar.getClaSS());
        type(By.cssSelector("[name='about']"), newCar.getAbout());
        type(By.cssSelector(".type_feature"), newCar.getTypeFeatere());
        type(By.cssSelector(".price"), newCar.getPrice());
    }
}
