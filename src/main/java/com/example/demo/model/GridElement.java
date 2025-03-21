package com.example.demo.model;

import lombok.Data;

/***
 * Represents a Coordinate on Given Ocean Floor
 */
@Data
public class GridElement {

    public GridElement(boolean isNavigable, boolean isOccupied){
        this.isNavigable = true;
        this.isOccupied = false;
    }

    //To Check if this floor height is navigable
    // or the probe has to ascend or descend to reach this Grid element
    private boolean isNavigable;

    //To Check if another probe or Diver is already there
    private boolean isOccupied;
}
