package com.example.springframeworkdi.controllers;

import com.example.springframeworkdi.services.GreetingService;
import com.example.springframeworkdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        GreetingService greetingService = new GreetingServiceImpl();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}