package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartesianCoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = new CartesianCoordinate(1, 2, 3);
    }

    @Test
    public void testGetDistance() {
        CartesianCoordinate coordinate1 = new CartesianCoordinate(1, 2, 3);
        CartesianCoordinate coordinate2 = new CartesianCoordinate(3, 2, 3);

        assertEquals(2, coordinate1.getDistance(coordinate2), 0.001);
    }

    @Test
    public void testIsEqual() {
        Coordinate coordinate = new CartesianCoordinate(1, 2, 3);
        Coordinate coordinate2 = new CartesianCoordinate(1, 2, 3);

        assertEquals(coordinate, coordinate2);
    }

}