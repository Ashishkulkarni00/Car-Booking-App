package com.ride_booking_system.service;

import com.ride_booking_system.exception.DriverNotFoundException;
import com.ride_booking_system.model.Driver;
import com.ride_booking_system.repository.DriverRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DriverService {

    private static DriverService driverService;

    public static DriverService getInstance(){
        if(driverService == null){
            driverService = new DriverService();
            return driverService;
        }
        return driverService;
    }


    private DriverRepository driverRepository = DriverRepository.getInstance();

    public void addDriver(Driver driver){
        driverRepository.addDriver(driver);
    }

    public List<Driver> getAllDrivers(){
        return driverRepository.getAllDrivers();
    }


    public Driver updateDriverByName(String name, Driver driver){
        List<Driver> driverList = driverRepository.getAllDrivers();
        Driver existingDriver = null;
        for(int i = 0; i < driverList.size(); i++){
            if(driverList.get(i).getName().equals(name)){
                existingDriver = driverList.get(i);
                driverList.remove(i);
                break;
            }
        }
        if(existingDriver == null){
            throw new DriverNotFoundException("Driver not found");
        }else{
            existingDriver.setName(driver.getName());
            existingDriver.setAge(driver.getAge());
            existingDriver.setIsAvailable(driver.getIsAvailable());
            existingDriver.setCarName(driver.getCarName());
            existingDriver.setCarNumber(driver.getCarNumber());
            existingDriver.setCurrentLocation(driver.getCurrentLocation());
            existingDriver.setGender(driver.getGender());
            driverRepository.addDriver(existingDriver);
            return existingDriver;
        }
    }
    public Driver getDriverByName(String name){
        return driverRepository.getByName(name);
    }
}