package com.mg.ss.inmemory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @GetMapping("/hello")
    public String hello()
    {
        return "Completed Request";
    }

}
