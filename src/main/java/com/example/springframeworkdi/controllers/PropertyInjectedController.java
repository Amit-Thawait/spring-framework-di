package com.example.springframeworkdi.controllers;

import com.example.springframeworkdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
