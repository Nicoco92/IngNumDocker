package com.ingnum.rentalservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BonjourController {

    @Value("${nameservice.url}")
    private String nameServiceUrl;

    @GetMapping("/bonjour")
    public String bonjour() {
        RestTemplate restTemplate = new RestTemplate();
        
        String name = restTemplate.getForObject(nameServiceUrl, String.class);
        
        return "Bonjour " + name;
    }
}