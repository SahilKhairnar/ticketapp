package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetByEmailServiceImpl implements GetByEmailService{

    private final UserRepository userRepository;

    @Autowired
    public GetByEmailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User userByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
