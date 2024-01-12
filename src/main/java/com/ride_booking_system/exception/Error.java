package com.ride_booking_system.exception;

import org.springframework.http.HttpStatus;

// ERROR MODEL
public class Error {

    private String message;


    public Error(String message) {
        super();
        this.message = message;

    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


}
