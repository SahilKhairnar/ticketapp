package com.pluralsight.fundamentals.controller;

import com.pluralsight.fundamentals.model.User;
import com.pluralsight.fundamentals.service.GetByEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class GetByEmailController {

    private final GetByEmailService getByEmailService;
    @Autowired
    public GetByEmailController(GetByEmailService getByEmailService){
        this.getByEmailService = getByEmailService;
    }

    @GetMapping("/email")
    public User userByEmail(@RequestParam String email){
        return getByEmailService.userByEmail(email);
    }

}
