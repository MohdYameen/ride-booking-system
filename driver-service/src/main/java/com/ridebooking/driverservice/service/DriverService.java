package com.ridebooking.driverservice.service;

import com.ridebooking.driverservice.dto.RideAcceptance;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    public String acceptRide(String driverId, RideAcceptance rideAcceptance){
        return "Driver "+driverId+" accepted ride "+ rideAcceptance.getRideId()+" from location "+rideAcceptance.getDriverLocation();
    }

}
