package ridebooking.rideservice.service;

import org.springframework.stereotype.Service;
import ridebooking.rideservice.dto.RideRequest;
import ridebooking.rideservice.dto.RideRequestEvent;

import java.util.UUID;

@Service
public class RiderService {

    private final KafkaProducerService kafkaProducerService;
//    public String requestRide(String riderId, RideRequest rideRequest){
//        return "Rider " +riderId+ " requested ride from "+rideRequest.getPickupLocation()+ " to "+rideRequest.getDropLocation();
//    }



    public RiderService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }
//
    public RideRequestEvent requestRide(RideRequest request) {
        String rideId = UUID.randomUUID().toString();

        RideRequestEvent event = new RideRequestEvent(
                rideId,
                request.getPickupLocation(),
                request.getDropLocation()
        );

        kafkaProducerService.sendRideRequestedEvent(event);

        return event;
    }
}
