//package com.ridebooking.driverservice.service;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import com.ridebooking.common.events.RideRequestEvent;
//
//@Service
//public class KafkaConsumerService {
//
//    @KafkaListener(
//            topics = "ride_requested",
//            groupId = "driver-service-group",
//            containerFactory = "rideRequestedKafkaListenerContainerFactory"
//    )
//    public void consumeRideRequested(RideRequestEvent event) {
//        System.out.println("✅ Received RideRequestedEvent: " + event);
//
//        // TODO:
//        // 1. Save ride into DB with status = REQUESTED
//        // 2. Later, expose /api/rides/{rideId}/accept to update status + publish RideAcceptedEvent
//    }
//}
