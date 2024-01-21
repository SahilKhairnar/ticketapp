package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    private final UserRepository userRepository;

    @Autowired
    public AuthenticationServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User Authenticate(String email, String password){

        System.out.println("Email (Service): " + email);

        User user = userRepository.findByEmail(email);

        if(user == null){
            System.out.println("user is null");
        }
        else {
            System.out.println(user.getEmail());
            System.out.println(user.getPassword());
        }

        if(user != null && user.getEmail().equals(email) && user.getPassword().equals(password)){
            System.out.println("Service returned Success");
            return user;
        }
        else{
            System.out.println("Service returned Login Failed");
            return null;
        }
    }
}
