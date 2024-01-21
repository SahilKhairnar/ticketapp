package com.pluralsight.fundamentals.controller;

import com.pluralsight.fundamentals.DTO.LoginRequest;
import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        User user = authenticationService.Authenticate(email,password);

        if(user != null){
            System.out.println("Controller Success triggered");
            return ResponseEntity.ok(user);
        }
        else{
            System.out.println("Controller Failure triggered");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(user);
        }
    }
}
