package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = new Coordinate(1, 2, 3);
    }

    @Test
    public void testGetDistance() {
        Coordinate coordinate = new Coordinate(1, 2, 3);
        Coordinate coordinate2 = new Coordinate(3, 2, 3);

        assertEquals(2, coordinate.getDistance(coordinate2), 0.01);
    }

    @Test
    public void testIsEqual() {
        Coordinate coordinate = new Coordinate(1, 2, 3);
        Coordinate coordinate2 = new Coordinate(1, 2, 3);

        assertEquals(coordinate, coordinate2);
    }

}