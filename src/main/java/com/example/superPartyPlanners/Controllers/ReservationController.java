package com.example.superPartyPlanners.Controllers;

import com.example.superPartyPlanners.Models.Reservation;
import com.example.superPartyPlanners.Services.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    ReservationServiceImpl reservationServiceImpl;
    @GetMapping("/reservation/{id}")
    public Optional<Reservation> getReservation(@PathVariable Long id){
        return reservationServiceImpl.getReservation(id);
    }

    @PostMapping("/create/reservation")
    public String postReservation(@RequestBody Reservation reservation){
        System.out.println(reservation.toString());
        reservationServiceImpl.postReservation(reservation);
        System.out.println(reservationServiceImpl.getReservation(1l));
        return "Reservation made";
    }
}
