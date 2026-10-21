package saf.engine.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import saf.structure.Cluster;
import saf.structure.Record;

public class KMeansClustering {
    private int k;
    private int maxIterations;
    private List<Cluster> clusters;
    private List<Record> records;
    private Random random;

    public KMeansClustering(int k, int maxIterations, List<Record> data) {
        this.k = k;
        this.maxIterations = maxIterations;
        this.clusters = new ArrayList<>();
        this.records = new ArrayList<>(data);
        this.random = new Random();
    }

    public double euclideanDistance(Record r1, Record r2) {
        return Math.sqrt(Math.pow(r1.getX() - r2.getX(), 2) + 
                        Math.pow(r1.getY() - r2.getY(), 2));
    }

    private void initializeCentroids() {
        List<Record> copy = new ArrayList<>(records);

        if (copy.size() < k) {
            throw new IllegalArgumentException("Not enough records to initialize " + k + " centroids.");
        }

        if (copy.isEmpty()) {
            throw new IllegalArgumentException("No records available to initialize centroids.");
        }

        for (int i = 0; i < k; i++) {
            int index = random.nextInt(copy.size());
            Record centroid = copy.remove(index);
            clusters.add(new Cluster(centroid));
        }
    }
}
