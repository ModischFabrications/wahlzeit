package org.wahlzeit.model.coordinate;

public interface Coordinate {
    CartesianCoordinate asCartesianCoordinate();
    double getCartesianDistance(Coordinate other);

    // https://en.wikipedia.org/wiki/Great-circle_distance
    SphericCoordinate asSphericCoordinate();
    double getCentralAngle(Coordinate other);

    /**
     * Check for (approximate) equality
     * *regardless of underlying type*
     */
    boolean isEqual(Coordinate other);
}
