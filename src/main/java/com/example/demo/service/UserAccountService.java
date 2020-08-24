package com.example.demo.service;

import com.example.demo.model.UserAccount;
import com.example.demo.repository.UserAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountRepo repo;

    public UserAccount createUserAccount(UserAccount userAccount){
        return repo.save(userAccount);
    }

    public Iterable<UserAccount> getListUserAccount(){
        return repo.findAll();
    }
}
