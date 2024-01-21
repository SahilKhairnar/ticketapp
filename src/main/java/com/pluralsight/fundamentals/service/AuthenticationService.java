package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.model.User;

public interface AuthenticationService {
    User Authenticate(String email, String password);

}
