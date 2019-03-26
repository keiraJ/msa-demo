package com.example.demo.services.aservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoffeeProvider implements CoffeeUseCase {

    @Value("${aservice.controller.name}")
    private String name;

    @Override
    public String order() {
        return name;
    }
}
