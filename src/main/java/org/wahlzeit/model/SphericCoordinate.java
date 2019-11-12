package org.wahlzeit.model;

public class SphericCoordinate implements Coordinate {
    private final double phi;
    private final double theta;
    private final double radius;

    public SphericCoordinate(double phi, double theta, double radius) {
        this.phi = phi;
        this.theta = theta;
        this.radius = radius;
    }

    @Override
    public CartesianCoordinate asCartesianCoordinate() {
        // FIXME: conversion
        return null;
    }

    /**
     * uses impl of cartesian, see that one for explanations
     */
    @Override
    public double getCartesianDistance(Coordinate other) {
        return this.asCartesianCoordinate().getCartesianDistance(other);
    }

    @Override
    public SphericCoordinate asSphericCoordinate() {
        return this;
    }

    @Override
    public double getCentralAngle(Coordinate other) {
        // FIXME: calculation
        return 99;
    }

    /**
     * uses impl of cartesian, see that one for explanations
     */
    @Override
    public boolean isEqual(Coordinate other) {
        // could be implemented directly (without Cartesian)
        // without many problems if one desires to do so
        return this.asCartesianCoordinate().isEqual(other);
    }
}
