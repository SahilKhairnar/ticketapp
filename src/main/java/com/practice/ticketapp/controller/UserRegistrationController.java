package com.practice.ticketapp.controller;

import com.practice.ticketapp.service.UserRegistrationService;
import com.practice.ticketapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    @Autowired
    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User newUser) {
        userRegistrationService.registerNewUser(newUser);
        return "User registered successfully!";
    }
}
