package com.pluralsight.fundamentals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pluralsight.fundamentals.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
