package com.example.demo.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProbeTest {

    @InjectMocks
    private Probe probe;

    @Test
    public void testMoveForward(){
        Assertions.assertNotNull(probe.move(true));
    }

    @Test
    public void testTurnLeft(){
        Assertions.assertNotNull(probe.turn(true));
    }
}
