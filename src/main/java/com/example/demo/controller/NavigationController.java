package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/navigate")
public class NavigationController {

    @Autowired
    private NavigationService navigationService;

    @PostMapping("move")
    public void move(@RequestParam(value = "forward", defaultValue = "true") boolean forward){
        navigationService.move(forward);

    }
}
