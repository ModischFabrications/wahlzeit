package org.wahlzeit.model;

import java.util.Objects;

public class CartesianCoordinate implements Coordinate {
    private double x;
    private double y;
    private double z;

    public CartesianCoordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * direct cartesian distance
     */
    public double getDistance(CartesianCoordinate other) {
        double distance = Math.sqrt(
                Math.pow(this.x - other.getX(), 2) +
                        Math.pow(this.y - other.getY(), 2) +
                        Math.pow(this.z - other.getZ(), 2)
        );
        assert !Double.isNaN(distance);
        return distance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            throw new IllegalArgumentException("Can only compare Locations");
        }

        CartesianCoordinate other = (CartesianCoordinate) obj;

        return this.isSimilar(other);
    }

    @Override
    public CartesianCoordinate asCartesianCoordinate() {
        return this;
    }

    @Override
    public double getCartesianDistance(Coordinate other) {
        return getDistance(other.asCartesianCoordinate());
    }

    @Override
    public SphericCoordinate asSphericCoordinate() {
        // FIXME: conversion
        return null;
    }

    /**
     * uses impl of spheric, see that one for explanations
     */
    @Override
    public double getCentralAngle(Coordinate other) {
        return this.asCartesianCoordinate().getCentralAngle(other);
    }

    /**
     * more of a "isSimilar" due to floating error compensation
     */
    @Override
    public boolean isEqual(Coordinate other) {
        return this.isSimilar(other.asCartesianCoordinate());
    }

    private boolean isSimilar(CartesianCoordinate other) {
        return (similar(this.x, other.getX())) && (similar(this.y, other.getY())) && (similar(this.z, other.getZ()));
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
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    private boolean similar(double d1, double d2) {
        double d = d1 / d2;
        return (Math.abs(d - 1.0) < 0.001);
    }
}
