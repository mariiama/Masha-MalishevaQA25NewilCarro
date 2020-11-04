package com.telran.qa.models;

public class NewCar {
    private  String country;
    private  String address;
    private  String distance_included;
    private  String serial_number;
    private  String brand;
    private  String model;
    private  String year;
    private  String engine;
    private  String fuel_consumption;
    private  String fuel;
    private  String transmition;
    private  String wd;
    private  String horsepower;
    private  String torque;
    private  String doors;
    private  String seats;
    private  String claSS;
    private  String about;
    private  String typeFeatere;
    private  String price;

    public NewCar(String country, String address, String distance_included,
                  String serial_number, String brand, String model, String year,
                  String engine, String fuel_consumption, String fuel, String transmition,
                  String wd, String horsepower, String torque, String doors, String seats, String ClaSS,
                  String About, String TypeFeatere, String Price) {
        this.country = country;
        this.address = address;
        this.distance_included = distance_included;
        this.serial_number = serial_number;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.fuel_consumption = fuel_consumption;
        this.fuel = fuel;
        this.transmition = transmition;
        this.wd = wd;
        this.horsepower = horsepower;
        this.torque = torque;
        this.doors = doors;
        this.seats = seats;
        claSS = ClaSS;
        about = About;
        typeFeatere = TypeFeatere;
        price = Price;
    }

    public NewCar() {

    }


    public NewCar withCountry(String country) {
        this.country = country;
        return this;
    }

    public NewCar withAddress(String address) {
        this.address = address;
        return this;
    }

    public NewCar withDistance_included(String distance_included) {
        this.distance_included = distance_included;
        return this;
    }

    public NewCar withSerial_number(String serial_number) {
        this.serial_number = serial_number;
        return this;
    }

    public NewCar withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public NewCar withModel(String model) {
        this.model = model;
        return this;
    }

    public NewCar withYear(String year) {
        this.year = year;
        return this;
    }

    public NewCar setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public NewCar setFuel_consumption(String fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
        return this;
    }

    public NewCar setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public NewCar setTransmition(String transmition) {
        this.transmition = transmition;
        return this;
    }

    public NewCar setWd(String wd) {
        this.wd = wd;
        return this;
    }

    public NewCar setHorsepower(String horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public NewCar setTorque(String torque) {
        this.torque = torque;
        return this;
    }

    public NewCar setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public NewCar setSeats(String seats) {
        this.seats = seats;
        return this;
    }

    public NewCar setClaSS(String claSS) {
        this.claSS = claSS;
        return this;
    }

    public NewCar setAbout(String about) {
        this.about = about;
        return this;
    }

    public NewCar setTypeFeatere(String typeFeatere) {
        this.typeFeatere = typeFeatere;
        return this;
    }

    public NewCar setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getDistance_included() {
        return distance_included;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel_consumption() {
        return fuel_consumption;
    }

    public String getFuel() {
        return fuel;
    }

    public String getTransmition() {
        return transmition;
    }

    public String getWd() {
        return wd;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getTorque() {
        return torque;
    }

    public String getDoors() {
        return doors;
    }

    public String getSeats() {
        return seats;
    }

    public String getClaSS() {
        return claSS;
    }

    public String getAbout() {
        return about;
    }

    public String getTypeFeatere() {
        return typeFeatere;
    }

    public String getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serial_number + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
