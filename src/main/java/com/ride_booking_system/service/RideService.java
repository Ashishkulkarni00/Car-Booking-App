package com.ride_booking_system.service;

import com.ride_booking_system.exception.DriverNotFoundException;
import com.ride_booking_system.exception.UserNotFoundException;
import com.ride_booking_system.model.Driver;
import com.ride_booking_system.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Component
public class RideService {

    private static RideService rideService;

    public static RideService getInstance(){
        if(rideService == null){
            rideService = new RideService();
            return rideService;
        }
        return rideService;
    }

    private UserService userService = UserService.getInstance();
    private DriverService driverService = DriverService.getInstance();


    public List<String> findRide(String userName, int[] source, int[] destination) {


        User user = userService.getUserByName(userName);

        if(user == null){
            throw new UserNotFoundException("user not found");
        }


        List<Driver> driverList = driverService.getAllDrivers();

        List<String> result = new ArrayList<>();

        if(driverList == null || driverList.isEmpty()){
            throw new DriverNotFoundException("No drivers found");
        }

        for(int i = 0; i < driverList.size(); i++){
            Driver driver = driverList.get(i);

            double x1 = (double) driver.getCurrentLocation()[0];
            double y1 = (double) driver.getCurrentLocation()[1];
            double x2 = (double) source[0];
            double y2 = (double) source[1];

            double distance = calculateDistance(x1,y1,x2,y2);

            if(driver.getIsAvailable() && distance <= (double)5){
                result.add(driver.getName());
            }
        }

        if(result.isEmpty()){
            throw new DriverNotFoundException("No ride Found");
        }


        return result;

    }

    public String chooseRide(String userName, String driverName) {

        User user = userService.getUserByName(userName);

        if(user == null){
            throw new UserNotFoundException("User not Found");
        }

        List<Driver> driverList = driverService.getAllDrivers();
        Driver driver = null;

        for(int i = 0; i < driverList.size(); i++){
            if(driverList.get(i).getName().equals(driverName)){
                driver = driverList.get(i);
                break;
            }
        }

        if(driver == null || !driver.getIsAvailable()){
            throw new DriverNotFoundException("Driver Not Available");
        }

        driver.setIsAvailable(false);
        return "Ride has been booked with " + driverName;

    }

    private double calculateDistance(double x1, double y1,double x2, double y2) {

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distance =  Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("distance = " + distance);
        return distance;
    }


}
