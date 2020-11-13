package com.example.superPartyPlanners.Services;

import com.example.superPartyPlanners.Models.Reservation;
import com.example.superPartyPlanners.Repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{

//    @Value("${api_key}")
//    String api_key;

    @Autowired
    ReservationRepo reservationRepo;

    @Override
    public Optional<Reservation> getReservation(Long id) {
        return reservationRepo.findById(id);
    }

    @Override
    public void postReservation(Reservation reservation) {
        reservationRepo.save(reservation);
    }

    @Override
    public Iterable<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }
}
