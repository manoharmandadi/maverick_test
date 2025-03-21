package com.example.demo.controller;

import com.example.demo.component.Probe;
import com.example.demo.model.Coordinate;
import com.example.demo.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/navigate")
public class NavigationController {

    @Autowired
    private NavigationService navigationService;

    @Autowired
    private Probe probe;

    @PostMapping("move")
    @ResponseStatus(HttpStatus.CREATED)
    public void move(@RequestParam(value = "forward", defaultValue = "true") boolean forward){
        Coordinate nextCoordinate = navigationService.isNavigable(probe.getCurrentCoordinates(), probe.getDirection(), forward );
        probe.move(nextCoordinate);
    }

    @PostMapping("turn")
    @ResponseStatus(HttpStatus.CREATED)
    public void turn(@RequestParam(value = "left", defaultValue = "true") boolean left){
        probe.turn(left);
    }

}
