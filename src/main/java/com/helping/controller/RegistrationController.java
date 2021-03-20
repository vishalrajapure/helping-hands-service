package com.helping.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helping")
public class RegistrationController {

    @GetMapping("/testHealth")
    public String testHealth(){
        return "Helping hand is accessible!!";
    }
}
