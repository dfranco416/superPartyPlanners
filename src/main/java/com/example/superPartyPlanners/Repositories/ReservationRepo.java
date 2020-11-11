package com.example.superPartyPlanners.Repositories;

import com.example.superPartyPlanners.Models.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends CrudRepository<Reservation, Long> {}
