package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {

    @Test
    public void testRoundTrip() {
        Coordinate baseCoordinate = new CartesianCoordinate(1, 2, 3);

        Coordinate sphericCoordinate = baseCoordinate.asSphericCoordinate();
        Coordinate assumedBaseCoordinate = sphericCoordinate.asCartesianCoordinate();

        assertEquals(baseCoordinate, assumedBaseCoordinate);
    }

    @Test
    public void testDistanceWithConversion() {
        Coordinate coordinate1 = new SphericCoordinate(1, 2, 3);
        Coordinate coordinate2 = new SphericCoordinate(1, 2, 5);

        assertEquals(2, coordinate1.getCartesianDistance(coordinate2), 0.001);
    }

    @Test
    public void testAngleWithConversion() {
        Coordinate coordinate1 = new CartesianCoordinate(1, 2, 3);
        Coordinate coordinate2 = new CartesianCoordinate(1, 2, 5);

        assertEquals(0.09822, coordinate1.getCentralAngle(coordinate2), 0.001);
    }

}