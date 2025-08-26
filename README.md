Rider service request: 

     http://localhost:8080/riders/12321/requestRide
     body
    {
        "pickupLocation": "Nainital",
            "dropLocation": "Rampur"
    }

Driver Service Request : 
    http://localhost:8081/drivers/12321/acceptRide
    body
    {
        "rideId": "12321",
            "driverLocation": "Bilaspur"
    }
