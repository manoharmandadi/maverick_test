package com.example.demo.component;

import com.example.demo.model.Coordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.stream.IntStream;

@ExtendWith(MockitoExtension.class)
public class FloorGridTest {

    private FloorGrid floorGrid;

    @BeforeEach
    public void initGrid(){
        floorGrid = new FloorGrid();
        ReflectionTestUtils.setField(floorGrid, "x", 15);
        ReflectionTestUtils.setField(floorGrid, "y", 20);
        floorGrid.initFloor();
    }


    @Test
    public void isInitialized(){
        IntStream.range(0, 15).forEach( x -> {
            IntStream.range(0, 20).forEach( y -> {
                Assertions.assertNotNull(floorGrid.getElement(new Coordinate(x, y)));
            });
        });
    }


}
