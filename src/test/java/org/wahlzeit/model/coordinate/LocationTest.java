package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    @Test
    public void testEquals() {
        Coordinate coordinate = new CartesianCoordinate(1, 2, 3);
        Location location = new Location(coordinate);

        Coordinate coordinate2 = new CartesianCoordinate(1, 2, 3);
        Location location2 = new Location(coordinate);

        assertEquals(coordinate, coordinate2);
    }

}