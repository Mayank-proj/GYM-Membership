package com.gym.fitnessfreek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {
    @GetMapping
    public ResponseEntity<String> server(){
        return new ResponseEntity<>("Server is live", HttpStatus.OK);
    }
}
