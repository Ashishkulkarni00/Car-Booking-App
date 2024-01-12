package com.ride_booking_system.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Object> UserNotFound(UserNotFoundException exception){
        Error err=new Error(exception.getMessage());
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = DriverNotFoundException.class)
    public ResponseEntity<Object> InvalidGrocery(DriverNotFoundException exception){
        Error err=new Error(exception.getMessage());
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }





}