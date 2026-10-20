package saf.stats;

import java.util.ArrayList;

public class Statistics {
    public static double mean(double[] values) {
        double sum = 0.0;

        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double mean(ArrayList<Double> values) {
        double sum = 0.0;

        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static double variance(ArrayList<Double> values) {
        double mean = mean(values);
        double sum = 0.0;

        for (double value : values) {
            sum += Math.pow(value - mean, 2);
        }

        return sum / values.size();
    }

    public static double variance(double[] values) {
        double mean = mean(values);
        double sum = 0.0;

        for (double value : values) {
            sum += Math.pow(value - mean, 2);
        }

        return sum / values.length;
    }
}
