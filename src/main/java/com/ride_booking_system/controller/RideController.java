package com.ride_booking_system.controller;

import com.ride_booking_system.dto.RideRequest;
import com.ride_booking_system.service.RideService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rides")
public class RideController {

    private RideService rideService = RideService.getInstance();


    @PostMapping("/find-rides")
    public List<String> findRides(@RequestBody RideRequest rideRequest){
        return rideService.findRide(rideRequest.getUserName(),rideRequest.getSource(),rideRequest.getDestination());
    }

    @GetMapping("/choose-ride/{userName}/{driverName}")
    public String chooseRide(@PathVariable ("userName") String userName, @PathVariable ("driverName") String driverName){
        return rideService.chooseRide(userName,driverName);
    }

}
