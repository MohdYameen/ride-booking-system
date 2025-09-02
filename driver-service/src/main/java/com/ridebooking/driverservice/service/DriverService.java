package com.ridebooking.driverservice.service;

import com.ridebooking.common.events.RideAcceptedEvent;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final KafkaProducerService kafkaProducerService;

    public DriverService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }
    public RideAcceptedEvent acceptRide(String rideId, String driverId) {
        RideAcceptedEvent event = new RideAcceptedEvent(
                rideId,
                driverId,
                "ACCEPTED"
        );
        kafkaProducerService.sendRideAcceptedEvent(event);
        return event;
    }
}
