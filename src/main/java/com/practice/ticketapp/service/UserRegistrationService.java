package com.practice.ticketapp.service;

import com.practice.ticketapp.repository.UserRepository;
import com.practice.ticketapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    private final UserRepository userRepository;

    @Autowired
    public UserRegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerNewUser(User newUser) {
        userRepository.save(newUser);
    }
}
