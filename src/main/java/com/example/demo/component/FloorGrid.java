package com.example.demo.component;

import com.example.demo.exception.OutsideRangeException;
import com.example.demo.model.Coordinate;
import com.example.demo.model.GridElement;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Positive;
import java.util.stream.IntStream;

@Component
public class FloorGrid {

    @Value("${ocean.floor.dimension.x}")
    @Positive
    int x;

    @Value("${ocean.floor.dimension.y}")
    @Positive
    int y;

    private GridElement[][] floor;

    @PostConstruct
    public void initFloor(){
        floor = new GridElement[x][y];
        IntStream.range(0,x).forEach( x -> {
            IntStream.range(0,y).forEach( y -> {
               floor[x][y] = new GridElement(true, false);
            });
        });
    }

    public GridElement getElement(Coordinate coordinate){
        if(isInsideGrid(coordinate)){
            return floor[coordinate.getX()][coordinate.getY()];
        } else {
            throw new OutsideRangeException("Given coordinates are outside Floor Range." );
        }

    }

    private boolean isInsideGrid(Coordinate coordinate){
        return coordinate.getX() < x && coordinate.getX() >= 0 &&
                coordinate.getY() < y && coordinate.getY() >= 0;
    }
}
