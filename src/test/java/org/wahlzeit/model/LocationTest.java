package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    @Test
    public void testEquals() {
        Coordinate coordinate = new Coordinate(1, 2, 3);
        Location location = new Location(coordinate);

        Coordinate coordinate2 = new Coordinate(1, 2, 3);
        Location location2 = new Location(coordinate);

        assertEquals(coordinate, coordinate2);
    }

}