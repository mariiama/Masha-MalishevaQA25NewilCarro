package com.telran.qa.tests;

import com.telran.qa.models.NewCar;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetTheCarWork extends TestBase {
    @BeforeMethod
    public void ensurePriconditions(){
        app.getHeader().openAddCarFormHeader();
    }

    @Test
    public void positiveTestFromLetTheCar(){

        //"positive test"
     app.getCar().filleRegistrationFormCar(new NewCar("Israel", "Bora Street", "500",
           "11-01-2112", "Ford", "Focus", "2013",
             "1.6", "7", "petrol", "automatic",
              "four-wheel drive", "200", "5000", "4", "6",
               "B", "Crossover manufactured by the America",
                "Car,category B", "100"));


        app.getCar().submitForm();
        Assert.assertTrue(app.getFooter().isPresentElementLetTheCarWork());

    }
    @Test
    public void negativeTestFromLetTheCar(){
        //"negativ test"
        app.getCar().filleRegistrationFormCar(new NewCar()
                .withCountry("Israel").withAddress("Osher Street").withDistance_included("500")
                .withSerial_number("07-07-1999").withBrand("Mazda").withModel("CX-9").withYear("2019")
                .setEngine("2.8").setFuel_consumption("").setFuel("patrol").setTransmition("automat")
                .setWd("four-wheel drive").setHorsepower("").setTorque("").setDoors("").setSeats("7")
                .setClaSS("A").setAbout("").setTypeFeatere("").setPrice(""));

        app.getCar().submitForm();
    }
    @Test(dataProvider = "validCarFromCSV", dataProviderClass = DataProviders.class)
    public void testFormLetTheCarWorkFromCSV(NewCar newCar) throws InterruptedException {
       // app.getCar().filleRegistrationFormCar();
        //app.header().click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));
        app.getCar().filleRegistrationFormCar(newCar);
        app.getCar().submitForm();

    }
}
