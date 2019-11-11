package org.wahlzeit.model;

public class SphericCoordinate implements Coordinate {
    // FIXME: implement everything
    @Override
    public CartesianCoordinate asCartesianCoordinate() {
        return null;
    }

    @Override
    public double getCartesianDistance(Coordinate other) {
        return 0;
    }

    @Override
    public SphericCoordinate asSphericCoordinate() {
        return null;
    }

    @Override
    public double getCentralAngle(Coordinate other) {
        return 0;
    }

    @Override
    public boolean isEqual(Coordinate other) {
        return false;
    }
}
