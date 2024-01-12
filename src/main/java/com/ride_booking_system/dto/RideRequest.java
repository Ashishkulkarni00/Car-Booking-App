package com.ride_booking_system.dto;

public class RideRequest {

    private String userName;

    int[] source;

    int[] destination;

    public RideRequest() {
    }

    public RideRequest(String userName, int[] source, int[] destination) {
        this.userName = userName;
        this.source = source;
        this.destination = destination;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int[] getSource() {
        return source;
    }

    public void setSource(int[] source) {
        this.source = source;
    }

    public int[] getDestination() {
        return destination;
    }

    public void setDestination(int[] destination) {
        this.destination = destination;
    }
}
