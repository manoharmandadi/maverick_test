package com.example.demo.service;

import com.example.demo.model.Coordinate;
import com.example.demo.model.Direction;

public interface NavigationService {

    Coordinate isNavigable(Coordinate coordinate, Direction direction, boolean forward);

}
