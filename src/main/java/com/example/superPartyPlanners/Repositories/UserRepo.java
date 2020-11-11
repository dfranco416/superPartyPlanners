package com.example.superPartyPlanners.Repositories;

import com.example.superPartyPlanners.Services.UsersServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;


@Repository
public interface UserRepo extends CrudRepository<UsersServiceImpl, Model>{}

