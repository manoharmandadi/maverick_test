package com.example.demo.service;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;

public interface NavigationService {

    Coordinate move(boolean forward);

    Direction turn(boolean left);
}
