package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GetByEmailService{
    User userByEmail(String email);
}
