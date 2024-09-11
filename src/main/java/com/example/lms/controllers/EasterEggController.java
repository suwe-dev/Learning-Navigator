package com.example.lms.controllers;

import com.example.lms.dto.EasterEggDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EasterEggController {
    @GetMapping("/hidden-feature/{number}")
    public ResponseEntity<EasterEggDto> getNumberDetails(@PathVariable Integer number) {
        String NUMBER_API_URL = "http://numbersapi.com/";

        RestTemplate restTemplate = new RestTemplate();
        String url = NUMBER_API_URL + number;
        String response = restTemplate.getForObject(url, String.class);

        return ResponseEntity.ok(new EasterEggDto(response));
    }
}
