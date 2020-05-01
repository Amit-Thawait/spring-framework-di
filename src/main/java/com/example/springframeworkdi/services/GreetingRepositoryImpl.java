package com.example.springframeworkdi.services;

public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Spanish Greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - German Greeting service";
    }
}
