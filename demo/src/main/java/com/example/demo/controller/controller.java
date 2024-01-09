package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Sample Spring Boot Application After a new Makeover with new Commit";
    }
}
