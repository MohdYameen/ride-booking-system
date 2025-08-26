package com.ridebooking.driverservice.dto;

public class RideAcceptance {

    private String rideId;
    private String driverLocation;

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getDriverLocation() {
        return driverLocation;
    }

    public void setDriverLocation(String driverLocation) {
        this.driverLocation = driverLocation;
    }
}
