package org.wahlzeit.model;

public interface Coordinate {
    CartesianCoordinate asCartesianCoordinate();
    double getCartesianDistance(Coordinate other);

    SphericCoordinate asSphericCoordinate();
    double getCentralAngle(Coordinate other);

    /**
     * Check for (approximate) equality
     * *regardless of underlying type*
     */
    boolean isEqual(Coordinate other);
}
