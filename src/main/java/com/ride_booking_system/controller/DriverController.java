package com.ride_booking_system.controller;

import com.ride_booking_system.model.Driver;
import com.ride_booking_system.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drivers")
public class DriverController {

    private DriverService driverService = DriverService.getInstance();
    @PostMapping("/add-driver")
    public String addDriver(@RequestBody Driver driver){
        driverService.addDriver(driver);
        return "new driver has been added";
    }


    @GetMapping("/get-all-drivers")
    public List<Driver> getAllDrivers(){
        return driverService.getAllDrivers();
    }


    @GetMapping("/get-by-name")
    public Driver getByName(@PathVariable ("name") String name){
        return driverService.getDriverByName(name);
    }

    @PutMapping("/update-by-name/{name}")
    public Driver updateDriverByName(@PathVariable ("name") String name, @RequestBody Driver driver){
        return driverService.updateDriverByName(name,driver);
    }
}
