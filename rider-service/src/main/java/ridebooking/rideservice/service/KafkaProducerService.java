package ridebooking.rideservice.service;

import ridebooking.rideservice.dto.RideRequestEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "ride_requested";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendRideRequestedEvent(RideRequestEvent event) {
        kafkaTemplate.send(TOPIC, event.getRideId(), event);
        System.out.println("Ride Requested Event published -> " + event.getRideId());
    }
}