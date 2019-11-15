package org.wahlzeit.model.coordinate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LocationTest.class,
        CartesianCoordinateTest.class,
        SphericCoordinateTest.class,
        CoordinateTest.class
})

public class LocationTestSuite {
}
