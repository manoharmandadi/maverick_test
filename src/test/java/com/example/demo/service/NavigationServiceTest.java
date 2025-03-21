package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NavigationServiceTest {

    private NavigationService navigationService;

    @Test
    public void testMoveForward(){
        Assertions.assertNotNull(navigationService.move(true));
    }
}
