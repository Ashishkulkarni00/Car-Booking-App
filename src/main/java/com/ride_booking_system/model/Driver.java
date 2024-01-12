package com.ride_booking_system.model;

public class Driver {

    private String name;

    private char gender;

    private int age;

    private String carNumber;

    private String carName;


    private int[] currentLocation;

    private boolean isAvailable;

    public Driver() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int[] getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int[] currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean available) {
        this.isAvailable = available;
    }

    public Driver(String name, char gender, int age, String carNumber, String carName, int[] currentLocation, boolean isAvailable) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.carNumber = carNumber;
        this.carName = carName;
        this.currentLocation = currentLocation;
        this.isAvailable = isAvailable;
    }
}

