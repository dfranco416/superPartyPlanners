package com.example.superPartyPlanners.Services;

import com.example.superPartyPlanners.Models.Reservation;

public interface ReservationService {
    public Reservation getReservation();
    public void postReservation(Reservation reservation);
}
