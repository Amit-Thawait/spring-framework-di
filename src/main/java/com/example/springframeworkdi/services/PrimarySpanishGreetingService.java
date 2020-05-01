package com.example.springframeworkdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
