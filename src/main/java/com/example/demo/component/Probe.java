package com.example.demo.component;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Probe {

    Logger logger = LoggerFactory.getLogger(Probe.class);

    @Value("${probe.initial.x}")
    private int x;

    @Value("${probe.initial.y}")
    private int y;

    @Value("${probe.initial.direction}")
    private Direction direction;


    public void move(Coordinate coordinate){
        this.x = coordinate.getX();
        this.y = coordinate.getY();
        logger.info(" Moved to "+coordinate.getX()+" "+coordinate.getY());
    }

    public Direction turn(boolean left){
        switch (direction){
            case SOUTH -> {
                if(left) return Direction.EAST;
                else return Direction.WEST;
            }
            case NORTH -> {
                if(left) return Direction.WEST;
                else return Direction.EAST;
            }
            case WEST -> {
                if(left) return Direction.SOUTH;
                else return Direction.NORTH;
            }
            case EAST -> {
                if(left) return Direction.NORTH;
                else return Direction.SOUTH;
            }
        }
        return null;
    }

    public Coordinate getCurrentCoordinates(){
        return new Coordinate(x, y);
    }

    public Direction getDirection(){
        return direction;
    }

}
