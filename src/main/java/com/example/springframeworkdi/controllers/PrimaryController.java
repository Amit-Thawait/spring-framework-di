package com.example.springframeworkdi.controllers;

import com.example.springframeworkdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
