package org.wahlzeit.model;

public class Location {
    public Coordinate coordinate;

    public Location(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            throw new IllegalArgumentException("Can only compare Locations");
        }
        Coordinate other = (Coordinate) obj;

        return this.coordinate.isEqual(other);
    }
}
