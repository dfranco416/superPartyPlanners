package com.example.superPartyPlanners.Controllers;

import com.example.superPartyPlanners.Models.Reservation;
import com.example.superPartyPlanners.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/index")
    public String reservationModel(Model model){
        model.addAttribute("reservations",reservationService.getAllReservations());
        return "index";
    }

    // This method allows thymeleaf to interpret input
    @RequestMapping(name = "/form", params = {"save"})
    public String addReservation(Reservation reservation, BindingResult bindingResult, ModelMap model){
        reservationService.postReservation(reservation);
        if(bindingResult.hasErrors()){
            return "/form";
        }
        model.clear();
        return "redirect:/index";
    }

}
