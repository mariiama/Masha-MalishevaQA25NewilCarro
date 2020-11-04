package com.telran.qa.tests;

import com.telran.qa.models.NewCar;
import com.telran.qa.models.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> validUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"fName1", "lname", "ln1a1me+2@gmail.com", "1Qaaaaaaa"});
        list.add(new Object[]{"aab", "FF", "111211+2@ss.com", "lkjhgfd2Q"});
        list.add(new Object[]{"112", "66", "11_1121+2@ss.com", "lkjhgfd2Q"});

        return list.iterator();
    }
    @DataProvider
    public Iterator<Object[]> validUserFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                new File("src/test/resources/tests_newUser.csv")));
        String line = reader.readLine();

        while (line != null){
            String[] split = line.split(",");
            list.add(new Object[]{new User().withFirstName(split[0]).withSecondName(split[1])
                    .withEmail(split[2]).withPassword(split[3])});
            line = reader.readLine();
        }

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> validCarFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                new File("src/test/resources/tests_newCar.csv")));
        String line = reader.readLine();

        while (line != null){
            String[] split = line.split(",");
            list.add(new Object[]{new NewCar()
                    .withCountry(split[0])
                    .withAddress(split[1])
                    .withDistance_included(split[2])
                    .withSerial_number(split[3])
                    .withBrand(split[4])
                    .withModel(split[5])
                    .withYear(split[6])
                    .setEngine(split[7])
                    .setFuel_consumption(split[8])
                    .setFuel(split[9])
                    .setTransmition(split[10])
                    .setWd(split[11])
                    .setHorsepower(split[12])
                    .setTorque(split[13])
                    .setDoors(split[14])
                    .setSeats(split[15])
                    .setClaSS(split[16])
                    .setAbout(split[17])
                    .setTypeFeatere(split[18])
                    .setPrice(split[19])});

            line = reader.readLine();
        }

        return list.iterator();
    }

}
