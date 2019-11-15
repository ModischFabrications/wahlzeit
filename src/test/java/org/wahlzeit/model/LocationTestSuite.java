package org.wahlzeit.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.wahlzeit.model.coordinate.CartesianCoordinateTest;
import org.wahlzeit.model.coordinate.CoordinateTest;
import org.wahlzeit.model.coordinate.LocationTest;
import org.wahlzeit.model.coordinate.SphericCoordinateTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LocationTest.class,
        CartesianCoordinateTest.class,
        SphericCoordinateTest.class,
        CoordinateTest.class
})

public class LocationTestSuite {
}
