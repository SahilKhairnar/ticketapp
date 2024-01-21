package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    private final UserRepository userRepository;

    @Autowired
    public UserRegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }
}
