package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SphericCoordinateTest {

    @Test
    public void testConstructor() {
        Coordinate coordinate = SphericCoordinate.create(1, 2, 3);
    }

    @Test
    public void testGetEqualAngleRadius() {
        SphericCoordinate coordinate1 = SphericCoordinate.create(1, 2, 3);
        SphericCoordinate coordinate2 = SphericCoordinate.create(1, 2, 5);

        assertEquals(0, coordinate1.doGetAngle(coordinate2), 0.001);
    }

    @Test
    public void testGetAngle() {
        SphericCoordinate coordinate1 = SphericCoordinate.create(1, 2, 3);
        SphericCoordinate coordinate2 = SphericCoordinate.create(1, 3, 3);

        // I hope that's expected, can't really check it against something else...
        assertEquals(0.524, coordinate1.doGetAngle(coordinate2), 0.001);
    }

    @Test
    public void testIsEqual() {
        Coordinate coordinate1 = SphericCoordinate.create(1, 2, 3);
        Coordinate coordinate2 = SphericCoordinate.create(1, 2, 3);

        assertEquals(coordinate1, coordinate2);
    }

    @Test
    public void testShared() {
        Coordinate coordinate1 = SphericCoordinate.create(1, 2, 3);
        Coordinate coordinate2 = SphericCoordinate.create(1, 2, 3);

        assertSame(coordinate1, coordinate2);
    }
}