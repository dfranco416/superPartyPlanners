package com.example.superPartyPlanners.Models;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer guestAmount;
    private String dateAndTime;

    public Reservation(){}

    public Reservation(Integer guestAmount, String dateAndTime){
        this.guestAmount = guestAmount;
        this.dateAndTime = dateAndTime;
    }

    public Long getId() {
        return id;
    }


    public Integer getGuestAmount() {
        return guestAmount;
    }

    public void setGuestAmount(Integer guestAmount) {
        this.guestAmount = guestAmount;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", guestAmount=" + guestAmount +
                ", dateAndTime='" + dateAndTime + '\'' +
                '}';
    }
}
