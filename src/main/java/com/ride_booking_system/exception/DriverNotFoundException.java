package com.ride_booking_system.exception;

public class DriverNotFoundException extends  RuntimeException{

    public DriverNotFoundException(String msg){
        super(msg);
    }

}
