package com.example.demo.controller;

import com.example.demo.model.UserAccount;
import com.example.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v2")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @PostMapping("/create")
    public ResponseEntity<?> addUserAccount(@RequestBody UserAccount userAccount){
        UserAccount userAccount1 = userAccountService.createUserAccount(userAccount);

        return new ResponseEntity<UserAccount>(userAccount1,HttpStatus.CREATED);
    }

    @GetMapping("/list-user")
    public Iterable<UserAccount> listUser(){
        return userAccountService.getListUserAccount();
    }


}
