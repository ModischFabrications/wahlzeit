package org.wahlzeit.model.coordinate;

import java.util.Objects;

public class SphericCoordinate extends AbstractCoordinate {
    private final double phi;
    private final double theta;
    private final double radius;

    /**
     * everything in radians!
     */
    public SphericCoordinate(double phi, double theta, double radius) {
        this.phi = phi;
        this.theta = theta;
        this.radius = radius;
    }

    @Override
    public SphericCoordinate asSphericCoordinate() {
        return this;
    }

    public CartesianCoordinate doAsCartesianCoordinate() {
        // seems to be this conversion. Be aware that it has a different notation!
        // p -> radius
        // https://en.wikipedia.org/wiki/List_of_common_coordinate_transformation

        double x = radius * Math.sin(theta) * Math.cos(phi);
        double y = radius * Math.sin(theta) * Math.sin(phi);
        double z = radius * Math.cos(theta);

        return new CartesianCoordinate(x, y, z);
    }

    double doGetAngle(SphericCoordinate sOther) {
        // https://en.wikipedia.org/wiki/Great-circle_distance
        // notation: theta -> lambda
        // It sounds crazy but the radius does not matter!
        double dPhi = sOther.getPhi() - this.getPhi();
        double dTheta = sOther.getTheta() - this.getTheta();

        double subformula = Math.pow(Math.sin(dPhi / 2), 2) +
                Math.cos(this.getPhi()) * Math.cos(sOther.getPhi()) *
                        Math.pow(Math.sin(dTheta / 2), 2);

        return 2 * Math.asin(Math.sqrt(subformula));
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
}
