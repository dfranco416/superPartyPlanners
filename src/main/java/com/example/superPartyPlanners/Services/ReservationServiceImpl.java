package com.example.superPartyPlanners.Services;

import com.example.superPartyPlanners.Models.Reservation;
import com.example.superPartyPlanners.Repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepo reservationRepo;

    @Override
    public Reservation getReservation() {
        RestTemplate restTemplate = new RestTemplate();
        return null;
    }

    @Override
    public void postReservation(Reservation reservation) {
        reservationRepo.save(reservation);
    }
}
