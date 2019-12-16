package org.wahlzeit.model.coordinate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SphericCoordinate extends AbstractCoordinate {
    // primitive not hashable
    private static Map<Integer, SphericCoordinate> instances = new HashMap<>();

    private final double phi;
    private final double theta;
    private final double radius;

    /**
     * everything in radians!
     */
    private SphericCoordinate(double phi, double theta, double radius) {
        this.phi = phi;
        this.theta = theta;
        this.radius = radius;

        assertClassInvariants();
    }

    public synchronized static SphericCoordinate create(double phi, double theta, double radius) {
        SphericCoordinate coordinate = new SphericCoordinate(phi, theta, radius);

        coordinate = makeShared(coordinate);

        return coordinate;
    }

    private synchronized static SphericCoordinate makeShared(SphericCoordinate coordinate) {
        // won't account for floating point errors
        int key = coordinate.hashCode();
        if (!instances.containsKey(key))
            instances.put(key, coordinate);
        return instances.get(key);
    }

    @Override
    public SphericCoordinate asSphericCoordinate() {
        assertClassInvariants();
        return this;
    }

    public CartesianCoordinate doAsCartesianCoordinate() {
        // seems to be this conversion. Be aware that it has a different notation!
        // p -> radius
        // https://en.wikipedia.org/wiki/List_of_common_coordinate_transformations

        double x = radius * Math.sin(theta) * Math.cos(phi);
        double y = radius * Math.sin(theta) * Math.sin(phi);
        double z = radius * Math.cos(theta);

        CartesianCoordinate cartesianCoordinate = CartesianCoordinate.create(x, y, z);

        // postcondition
        cartesianCoordinate.assertClassInvariants();
        return cartesianCoordinate;
    }

    double doGetAngle(SphericCoordinate sOther) {
        //precondition
        sOther.assertClassInvariants();

        // https://en.wikipedia.org/wiki/Great-circle_distance
        // notation: theta -> lambda
        // It sounds crazy but the radius does not matter!
        double dPhi = sOther.getPhi() - this.getPhi();
        double dTheta = sOther.getTheta() - this.getTheta();

        double subformula = Math.pow(Math.sin(dPhi / 2), 2) +
                Math.cos(this.getPhi()) * Math.cos(sOther.getPhi()) *
                        Math.pow(Math.sin(dTheta / 2), 2);

        double angle = 2 * Math.asin(Math.sqrt(subformula));

        // postcondition
        assert !Double.isNaN(angle);
        return angle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phi, theta, radius);
    }

    public double getPhi() {
        return phi;
    }

    public double getTheta() {
        return theta;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected void assertClassInvariants() {
        assert !Double.isNaN(this.phi);
        assert !Double.isNaN(this.theta);
        assert !Double.isNaN(this.radius);

        // TODO: ask a mathematician what the value range actually is
        assert this.phi > 0 && this.phi < 360;
        assert this.theta > 0 && this.theta < 360;
        assert this.phi > 0 && this.phi < 360;
    }
}
