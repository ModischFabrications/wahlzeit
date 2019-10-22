package org.wahlzeit.model;

public class Coordinate {
    private double x;
    private double y;
    private double z;

    public Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * direct cartesian distance
     */
    public double getDistance(Coordinate other) {
        double distance = Math.sqrt(
                Math.pow(this.x - other.getX(), 2) +
                        Math.pow(this.y - other.getY(), 2) +
                        Math.pow(this.z - other.getZ(), 2)
        );
        assert !Double.isNaN(distance);
        return distance;
    }

    public boolean isEqual(Coordinate other) {
        return (this.x == other.getX()) && (this.y == other.getY()) && (this.z == other.getZ());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
