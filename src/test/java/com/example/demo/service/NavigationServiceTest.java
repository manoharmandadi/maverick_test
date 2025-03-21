package com.example.demo.service;

import com.example.demo.component.FloorGrid;
import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;
import com.example.demo.model.GridElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NavigationServiceTest {

    @InjectMocks
    private NavigationServiceImpl navigationService;

    @Mock
    private FloorGrid floorGrid;

    @Test
    public void testMoveForward(){
        Mockito.when(floorGrid.getElement(Mockito.any(Coordinate.class))).thenReturn(new GridElement(true, false));
        Assertions.assertNotNull(navigationService.isNavigable(new Coordinate(3, 3), Direction.EAST, true));
    }
}
