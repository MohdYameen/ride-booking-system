package com.ridebooking.driverservice.controller;


import com.ridebooking.driverservice.dto.RideAcceptance;
import com.ridebooking.driverservice.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    //http://localhost:8081/drivers/12321/acceptRide
    //body
//    {
//        "rideId": "12321",
//            "driverLocation": "Bilaspur"
//    }

    @PostMapping("/{driverId}/acceptRide")
    public String acceptRide(@PathVariable String driverId, @RequestBody RideAcceptance rideAcceptance){
        return driverService.acceptRide(driverId, rideAcceptance);
    }

}
