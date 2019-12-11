package org.wahlzeit.model.coordinate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    @Test
    public void testEquals() {
        Coordinate coordinate = CartesianCoordinate.create(1, 2, 3);
        Location location = new Location(coordinate);

        Coordinate coordinate2 = CartesianCoordinate.create(1, 2, 3);
        Location location2 = new Location(coordinate);

        assertEquals(coordinate, coordinate2);
    }

}