package com.example.superPartyPlanners.Services;

import com.example.superPartyPlanners.Models.Reservation;

import java.util.Optional;

public interface ReservationService {
    public Optional<Reservation> getReservation(Long id);
    public void postReservation(Reservation reservation);
    public Iterable<Reservation> getAllReservations();
}
