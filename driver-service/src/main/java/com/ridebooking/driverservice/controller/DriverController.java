package com.ridebooking.driverservice.controller;


import com.ridebooking.common.events.RideAcceptedEvent;
import com.ridebooking.driverservice.dto.RideAcceptance;
import com.ridebooking.driverservice.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    //http://localhost:8082/drivers/fa0e1ac5-6a8e-4df5-9a69-f6d9950fcbdf/accept?driverId=driver-42

    @PostMapping("/{rideId}/accept")
    public ResponseEntity<RideAcceptedEvent> acceptRide(
            @PathVariable String rideId,
            @RequestParam String driverId) {

        RideAcceptedEvent event = driverService.acceptRide(rideId, driverId);
        return ResponseEntity.ok(event);
    }
}
