package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CartesianCoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = CartesianCoordinate.create(1, 2, 3);
    }

    @Test
    public void testGetDistance() {
        CartesianCoordinate coordinate1 = CartesianCoordinate.create(1, 2, 3);
        CartesianCoordinate coordinate2 = CartesianCoordinate.create(3, 2, 3);

        assertEquals(2, coordinate1.doGetDistance(coordinate2), 0.001);
    }

    @Test
    public void testIsEqual() {
        Coordinate coordinate = CartesianCoordinate.create(1, 2, 3);
        Coordinate coordinate2 = CartesianCoordinate.create(1, 2, 3);

        assertEquals(coordinate, coordinate2);
    }

    @Test
    public void testShared() {
        Coordinate coordinate = CartesianCoordinate.create(1, 2, 3);
        Coordinate coordinate2 = CartesianCoordinate.create(1, 2, 3);

        assertSame(coordinate, coordinate2);
    }

}