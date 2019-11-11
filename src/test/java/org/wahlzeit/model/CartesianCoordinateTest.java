package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartesianCoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = new CartesianCoordinate(1, 2, 3);
    }

    @Test
    public void testGetDistance() {
        CartesianCoordinate coordinate = new CartesianCoordinate(1, 2, 3);
        CartesianCoordinate coordinate2 = new CartesianCoordinate(3, 2, 3);

        assertEquals(2, coordinate.getDistance(coordinate2), 0.01);
    }

    @Test
    public void testIsEqual() {
        Coordinate coordinate = new CartesianCoordinate(1, 2, 3);
        Coordinate coordinate2 = new CartesianCoordinate(1, 2, 3);

        assertEquals(coordinate, coordinate2);
    }

}