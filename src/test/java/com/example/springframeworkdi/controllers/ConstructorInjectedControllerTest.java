package com.example.springframeworkdi.controllers;

import com.example.springframeworkdi.services.GreetingService;
import com.example.springframeworkdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        GreetingService greetingService = new ConstructorGreetingService();
        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}