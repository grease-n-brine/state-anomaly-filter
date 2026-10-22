package saf.structure;

import java.util.Arrays;

public class Point {
    private final double[] coordinates;

    public Point(double[] coordinates) {
        if (coordinates == null || coordinates.length == 0) {
            throw new IllegalArgumentException("Coordinates cannot be null or empty");
        }
        this.coordinates = Arrays.copyOf(coordinates, coordinates.length);
    }

    public double getX() {
        return coordinates[0];
    }
    
    public double getY() {
        return coordinates[1];
    }

    public double getZ() {
        return coordinates[2];
    }

    public double[] getCoordinates() {
        return coordinates;
    }
}
