package com.ride_booking_system.repository;

import com.ride_booking_system.model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {

    private List<Driver> driverList;
    private static DriverRepository driverRepository;

    private DriverRepository(){
        this.driverList = new ArrayList<>();
    }

    public static DriverRepository getInstance(){
        if(driverRepository == null){
            driverRepository = new DriverRepository();
            return driverRepository;
        }
        return driverRepository;
    }



    public List<Driver> getAllDrivers(){
        return this.driverList;
    }

    public Driver getByName(String name) {
        if(driverList == null){
            return null;
        }
        Driver driver = null;
        for(int i = 0; i < driverList.size(); i++){
            if(driverList.get(i).getName().equals(name)){
                driver = driverList.get(i);
                break;
            }
        }
        return driver;
    }

    public void addDriver(Driver driver) {
        if(driverList == null){
            driverList = new ArrayList<>();
            driverList.add(driver);
        }else{
            driverList.add(driver);
        }
    }

}

