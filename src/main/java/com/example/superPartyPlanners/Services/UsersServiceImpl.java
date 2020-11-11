package com.example.superPartyPlanners.Services;


import com.example.superPartyPlanners.Model.UsersModel;
import com.example.superPartyPlanners.Repositories.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    UserRepo userRepo;
    @Override
    public User getUsersFromUserApi() {
        return null;
    }

    @Override
    public void postUsersFromApi(UsersModel user) {

    }

    @Override
    public Iterable<UsersService> getAllUsers() {
        return null;
    }
}
