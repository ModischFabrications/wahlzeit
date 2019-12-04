package org.wahlzeit.model.coordinate;

public class Location {
    public Coordinate coordinate;

    public Location(Coordinate coordinate) throws IllegalArgumentException {
        if (coordinate == null) throw new IllegalArgumentException("Coordinate not defined");

        this.coordinate = coordinate;
    }

    @Override
    public boolean equals(Object obj) throws IllegalArgumentException {
        if (obj.getClass() != this.getClass()) {
            throw new IllegalArgumentException("Can only compare Locations");
        }
        Coordinate other = (Coordinate) obj;

        return this.coordinate.isEqual(other);
    }
}
