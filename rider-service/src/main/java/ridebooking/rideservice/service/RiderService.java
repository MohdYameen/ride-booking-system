package ridebooking.rideservice.service;

import org.springframework.stereotype.Service;
import ridebooking.rideservice.dto.RideRequest;

@Service
public class RiderService {

    public String requestRide(String riderId, RideRequest rideRequest){
        return "Rider " +riderId+ " requested ride from "+rideRequest.getPickupLocation()+ " to "+rideRequest.getDropLocation();
    }
}
