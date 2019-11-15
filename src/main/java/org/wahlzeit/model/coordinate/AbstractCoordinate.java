package org.wahlzeit.model.coordinate;

public abstract class AbstractCoordinate implements Coordinate {

    protected static boolean similar(double d1, double d2) {
        double d = d1 / d2;
        return (Math.abs(d - 1.0) < 0.001);
    }
}
