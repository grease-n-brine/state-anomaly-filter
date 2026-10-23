package saf.engine.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import saf.structure.Cluster;
import saf.structure.Point;

public class KMeansClustering {
    private final int k;
    private final int maxIterations;
    private final List<Cluster> clusters;
    private final List<Point> records;
    private final Random random;

    public KMeansClustering(int k, int maxIterations, List<Point> data) {
        this.k = k;
        this.maxIterations = maxIterations;
        this.clusters = new ArrayList<>();
        this.records = new ArrayList<>(data);
        this.random = new Random();
    }

    public double euclideanDistance(Point r1, Point r2) {
        return Math.sqrt(Math.pow(r1.getX() - r2.getX(), 2) + 
                        Math.pow(r1.getY() - r2.getY(), 2));
    }

    private void initializeCentroids() {
        clusters.clear();
        List<Point> copy = new ArrayList<>(records);

        if (copy.size() < k) {
            throw new IllegalArgumentException("Not enough records to initialize " + k + " centroids.");
        }

        if (copy.isEmpty()) {
            throw new IllegalArgumentException("No records available to initialize centroids.");
        }

        for (int i = 0; i < k; i++) {
            int index = random.nextInt(copy.size());
            Point centroid = copy.remove(index);
            Cluster cluster = new Cluster(centroid);
            cluster.setId(i);
            clusters.add(cluster);
        }
    }

    private int nearestClusterId(Point record) {
        double minDistance = Double.MAX_VALUE;
        int nearestClusterID = -1;

        for (Cluster cluster : clusters) {
            double distance = euclideanDistance(record, cluster.getCentroid());

            if (distance < minDistance) {
                minDistance = distance;
                nearestClusterID = cluster.getId();
            }
        }

        return nearestClusterID;
    }

    public void fit() {
        if (records.isEmpty()) {
            throw new IllegalArgumentException("No records available for clustering.");
        }

        initializeCentroids();
        int[] assignments = new int[records.size()];
        Arrays.fill(assignments, -1);

        for (int iteration = 0; iteration < maxIterations; iteration++) {
            boolean assignmentsChanged = false;
            double[] sumX = new double[k];
            double[] sumY = new double[k];
            int[] counts = new int[k];

            for (int i = 0; i < records.size(); i++) {
                Point record = records.get(i);
                int nearestClusterID = nearestClusterId(record);

                if (nearestClusterID < 0) {
                    throw new IllegalStateException("Failed to find nearest cluster.");
                }

                if (assignments[i] != nearestClusterID) {
                    assignmentsChanged = true;
                    assignments[i] = nearestClusterID;
                }

                sumX[nearestClusterID] += record.getX();
                sumY[nearestClusterID] += record.getY();
                counts[nearestClusterID]++;
            }

            for (Cluster cluster : clusters) {
                int clusterId = cluster.getId();

                if (counts[clusterId] == 0) {
                    continue;
                }

                double centroidX = sumX[clusterId] / counts[clusterId];
                double centroidY = sumY[clusterId] / counts[clusterId];
                cluster.setCentroid(new Point(new double[] { centroidX, centroidY }));
            }

            if (!assignmentsChanged) {
                break;
            }
        }
    }

    private boolean dimensionMismatch(Point p1, Point p2) {
        return p1.getDimension() != p2.getDimension();
    }
}
