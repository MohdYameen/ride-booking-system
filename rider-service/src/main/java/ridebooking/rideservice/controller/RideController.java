package ridebooking.rideservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ridebooking.rideservice.dto.RideRequest;
import ridebooking.rideservice.service.RiderService;

@RestController
@RequestMapping("/riders")
public class RideController {

    @Autowired
    private RiderService riderService;

    // http://localhost:8080/riders/12321/requestRide
    // body
//    {
//        "pickupLocation": "Nainital",
//            "dropLocation": "Rampur"
//    }
    @PostMapping("/{riderId}/requestRide")
    public String requestRide(@PathVariable String riderId, @RequestBody RideRequest rideRequest){
        return riderService.requestRide(riderId, rideRequest);
    }
}
