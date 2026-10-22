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

    public int getDimension() {
        return coordinates.length;
    }

    public double get(int index) {
        return coordinates[index];
    }

    public double getDistanceTo(Point otherPoint) {
        if (this.getDimension() != otherPoint.getDimension()) {
            throw new IllegalArgumentException("Points must have the same dimension");
        }

        double sum = 0;

        for (int i = 0; i < this.getDimension(); i++) {
            double diff = this.get(i) - otherPoint.get(i);
            sum += diff * diff;
        }

        return Math.sqrt(sum);
    }

    public double[] getCoordinates() {
        return Arrays.copyOf(coordinates, coordinates.length);
    }

    @Override 
    public String toString() {
        return Arrays.toString(coordinates);
    }
}
