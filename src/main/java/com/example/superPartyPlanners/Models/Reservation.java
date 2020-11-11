package com.example.superPartyPlanners.Models;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long guestAmount;
    private String dateAndTime;

//    @OneToMany(mappedBy = "users")
//    private User user;

    public Reservation(long id, Long guestAmount, String dateAndTime){
        this.id = id;
        this.guestAmount = guestAmount;
        this.dateAndTime = dateAndTime;
    }

    public Long getId() {
        return id;
    }


    public Long getGuestAmount() {
        return guestAmount;
    }

    public void setGuestAmount(Long guestAmount) {
        this.guestAmount = guestAmount;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
