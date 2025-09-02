package com.ridebooking.driverservice.dto;

public class RideAcceptedEvent {
    private String rideId;
    private String driverId;
    private String status;

    public RideAcceptedEvent() {}

    public RideAcceptedEvent(String rideId, String driverId, String status) {
        this.rideId = rideId;
        this.driverId = driverId;
        this.status = status;
    }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public String getDriverId() { return driverId; }
    public void setDriverId(String driverId) { this.driverId = driverId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}