package com.example.demo.service;

import com.example.demo.component.FloorGrid;
import com.example.demo.component.Probe;
import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import com.example.demo.model.GridElement;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Autowired
    private FloorGrid floor;


    @Override
    public Coordinate isNavigable(Coordinate coordinate, Direction direction, boolean forward) {
        Coordinate nextStep = getNextCoordinate(coordinate, direction, forward);
        GridElement element = floor.getElement(nextStep);
        if (element.isNavigable()) {
            return nextStep;
        } else {
            return null;
        }
    }

    private Coordinate getNextCoordinate(Coordinate coordinate, Direction direction, boolean forward){
        switch (direction){
            case SOUTH -> {
                if(forward){
                    return new Coordinate(coordinate.getX(), coordinate.getY()-1);
                } else {
                    return new Coordinate(coordinate.getX(), coordinate.getY()+1);
                }
            }
            case EAST -> {
                if(forward){
                    return new Coordinate(coordinate.getX()+1, coordinate.getY());
                } else {
                    return new Coordinate(coordinate.getX()-1, coordinate.getY());
                }
            }
            case NORTH -> {
                if(forward){
                    return new Coordinate(coordinate.getX(), coordinate.getY()+1);
                } else {
                    return new Coordinate(coordinate.getX(), coordinate.getY()-1);
                }
            }
            case WEST -> {
                if(forward){
                    return new Coordinate(coordinate.getX()-1, coordinate.getY());
                } else {
                    return new Coordinate(coordinate.getX()+1, coordinate.getY());
                }
            }
        }
        return null;
    }
}
