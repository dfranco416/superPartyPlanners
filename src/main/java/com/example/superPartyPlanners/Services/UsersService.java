package com.example.superPartyPlanners.Services;


import com.example.superPartyPlanners.Models.UsersModel;
import org.apache.catalina.User;

interface UsersService {

        public User getUsersFromUserApi();
        public void postUsersFromApi( UsersModel user);
        public Iterable<UsersService> getAllUsers();
    }


