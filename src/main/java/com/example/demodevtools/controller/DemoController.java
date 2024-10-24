package com.example.demodevtools.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello, world! Hi this is Abhishek here...", HttpStatus.OK);
    }
}
