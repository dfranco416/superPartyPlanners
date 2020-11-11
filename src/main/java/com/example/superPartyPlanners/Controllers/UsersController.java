package com.example.superPartyPlanners.Controllers;


import com.example.superPartyPlanners.Services.UsersServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @GetMapping("/users")
    public String getAllUsers(){
        return usersServiceImpl.getAllUsers().toString();
    }
    @PostMapping("/create/users")
    public String postUsers() {
        User user = usersServiceImpl.getUsersFromUserApi();
        return "User fetched and created";
}}
