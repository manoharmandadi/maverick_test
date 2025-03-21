package com.example.demo.component;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Probe {

    @Value("${probe.initial.x}")
    private int x;

    @Value("${probe.initial.y}")
    private int y;

    @Value("${probe.initial.direction")
    private Direction direction;


    public Coordinate move(boolean forward){
        return null;
    }

    public Direction turn(boolean left){
        return null;
    }

}
