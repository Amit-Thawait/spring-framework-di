package com.example.springframeworkdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
