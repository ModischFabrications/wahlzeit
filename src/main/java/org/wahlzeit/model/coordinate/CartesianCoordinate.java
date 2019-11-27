package org.wahlzeit.model.coordinate;

import java.util.Objects;

public class CartesianCoordinate extends AbstractCoordinate {
    private final double x;
    private final double y;
    private final double z;

    public CartesianCoordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        assertClassInvariants();
    }

    @Override
    public CartesianCoordinate asCartesianCoordinate() {
        assertClassInvariants();
        return this;
    }

    SphericCoordinate doAsSphericCoordinate() {
        // https://en.wikipedia.org/wiki/Spherical_coordinate_system
        double r = Math.sqrt(x * x + y * y + z * z);
        double phi = Math.atan(y / x);
        // Math.atan2(y/x); ?
        double theta = Math.acos(z / r);

        SphericCoordinate sphericCoordinate = new SphericCoordinate(phi, theta, r);

        // postcondition
        sphericCoordinate.assertClassInvariants();
        return sphericCoordinate;
    }

    /**
     * direct cartesian distance
     */
    public double doGetDistance(CartesianCoordinate other) {
        //precondition
        other.assertClassInvariants();

        double distance = Math.sqrt(
                Math.pow(this.x - other.getX(), 2) +
                        Math.pow(this.y - other.getY(), 2) +
                        Math.pow(this.z - other.getZ(), 2)
        );
        assert !Double.isNaN(distance);
        return distance;
    }

    /**
     * with floating point error compensation
     */
    @Override
    protected boolean isSimilar(Coordinate other) {
        CartesianCoordinate cartOther = other.asCartesianCoordinate();
        return (similar(this.x, cartOther.getX())) && (similar(this.y, cartOther.getY())) && (similar(this.z, cartOther.getZ()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
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

    @Override
    protected void assertClassInvariants() {
        assert !Double.isNaN(this.x);
        assert !Double.isNaN(this.y);
        assert !Double.isNaN(this.z);
    }

}
