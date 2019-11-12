package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SphericCoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = new SphericCoordinate(1, 2, 3);
    }

    @Test
    public void testGetAngle() {
        SphericCoordinate coordinate1 = new SphericCoordinate(1, 2, 3);
        SphericCoordinate coordinate2 = new SphericCoordinate(1, 2, 5);

        assertEquals(2, coordinate1.getCentralAngle(coordinate2), 0.01);
    }

    @Test
    public void testIsEqual() {
        SphericCoordinate coordinate1 = new SphericCoordinate(1, 2, 3);
        SphericCoordinate coordinate2 = new SphericCoordinate(1, 2, 5);

        assertEquals(2, coordinate1.getCentralAngle(coordinate2), 0.001);
    }
}