package com.actuator.SpringActuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-actuator")
public class Mycontroller {

    @GetMapping("/test")
    public String testEndPoint(){
        return "This is the tsring purpose";
    }

}
