package com.example.demo.component;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
public class ProbeTest {

    private Probe probe;


    @BeforeEach
    public void initProbe(){
        probe = new Probe();
        ReflectionTestUtils.setField(probe, "x", 10);
        ReflectionTestUtils.setField(probe, "y", 10);
        ReflectionTestUtils.setField(probe, "direction", Direction.EAST);
    }

    @Test
    public void testMoveForward(){
        probe.move(new Coordinate(10, 10));
    }

    @Test
    public void testTurnLeft(){
        Assertions.assertNotNull(probe.turn(true));
    }
}
