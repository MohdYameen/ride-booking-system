package com.ridebooking.common.events;

public class RideRequestEvent {
    private String pickupLocation;
    private String dropLocation;
    private String rideId;

    public RideRequestEvent(String pickupLocation, String dropLocation, String rideId) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.rideId = rideId;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
}