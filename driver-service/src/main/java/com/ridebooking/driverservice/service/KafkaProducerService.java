package com.ridebooking.driverservice.service;

import com.ridebooking.common.events.RideAcceptedEvent;
import com.ridebooking.common.events.RideRequestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String ACCEPTED_TOPIC = "ride_accepted";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendRideAcceptedEvent(RideAcceptedEvent event) {
        kafkaTemplate.send(ACCEPTED_TOPIC, event.getRideId(), event);
        System.out.println("Ride Accepted Event published -> " + event.getRideId());
    }
}