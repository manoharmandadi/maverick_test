package com.example.demo.service;

import com.example.demo.component.Probe;
import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl implements NavigationService {


    @Autowired
    private Probe probe;

    @Override
    public Coordinate move(boolean forward) {
        return probe.move(forward);
    }

    @Override
    public Direction turn(boolean left) {
        return probe.turn(left);
    }


}
