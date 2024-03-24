package com.example.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @Value("${message-common}")
    private String common;

    @Value("${message}")
    private String message;
    @GetMapping
    public String getDate(){
        return "message "+message+" ,  common  "+common;
    }
}
