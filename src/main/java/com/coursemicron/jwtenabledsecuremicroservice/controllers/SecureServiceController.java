package com.coursemicron.jwtenabledsecuremicroservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/service")
public class SecureServiceController {
    @GetMapping("/unrestricted")
    public ResponseEntity<?> getMessage() {
        return new ResponseEntity<>("Hello... You are receiving unrestricted data.", HttpStatus.OK);
    }
    @GetMapping("/secure")
    public ResponseEntity<?> getRestrictedMessage() {
        return new ResponseEntity<>("Cool , you have now received secure data.", HttpStatus.OK);
    }
}
