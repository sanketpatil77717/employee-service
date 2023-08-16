package com.ccf.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> getGreetings() {
        return new ResponseEntity<>("Hello User !", HttpStatus.OK);
    }

}
