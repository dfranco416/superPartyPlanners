package com.example.superPartyPlanners.Controllers;

import com.example.superPartyPlanners.Models.Reservation;
import com.example.superPartyPlanners.Services.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    ReservationServiceImpl reservationServiceImpl;
    @GetMapping("/reservation")
    public Reservation getReservation(){
        return reservationServiceImpl.getReservation();
    }

    @PostMapping("/create/reservation")
    public String postReservation(){
        Reservation reservation = reservationServiceImpl.getReservation();
        reservationServiceImpl.postReservation(reservation);
        return "Reservation made";
    }
}
