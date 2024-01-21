package com.pluralsight.fundamentals.controller;

import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    @Autowired
    public UserRegistrationController(UserRegistrationService userRegistrationService){
        this.userRegistrationService = userRegistrationService;
    }

    @PostMapping("/register")
    public String registerTUser(@RequestBody User user){
        userRegistrationService.registerUser(user);
        return "Registration Successful";
    }

}
