package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetTheCarWork extends TestBase {
    @BeforeMethod
    public void ensurePriconditions(){
        if(!isUserLoggedIn())
            logIn();
        isPresentElementLetTheCar();
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));
    }

    public void logIn() {
        FillLoginForm(new User().withEmail("foxqa25-3@qa.co").withPassword("FoXfOxFoX1"));

        submitForm();
    }

    @Test
    public void testFromLetTheCar(){
        //"positive test"
     filleRegistrationFormCar(new NewCar("Israel", "Bora Street", "500",
           "11-01-2112", "Ford", "Focus", "2013",
             "1.6", "7", "petrol", "automatic",
              "four-wheel drive", "200", "5000", "4", "6",
               "B", "Crossover manufactured by the America",
                "Car,category B", "100"));


        submitForm();
        Assert.assertTrue(isPresentElementLetTheCarWork());

    }
    @Test
    public void NegativeTest(){
        //"negativ test"
        filleRegistrationFormCar(new NewCar()
                .withCountry("Israel").withAddress("Osher Street").withDistance_included("500")
                .withSerial_number("07-07-1999").withBrand("Mazda").withModel("CX-9").withYear("2019")
                .setEngine("2.8").setFuel_consumption("").setFuel("patrol").setTransmition("automat")
                .setWd("four-wheel drive").setHorsepower("").setTorque("").setDoors("").setSeats("7")
                .setClaSS("A").setAbout("").setTypeFeatere("").setPrice(""));

        submitForm();

    }


    public void filleRegistrationFormCar(NewCar newCar) {
        type(By.cssSelector("[name='country']"), newCar.getCountry());
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
