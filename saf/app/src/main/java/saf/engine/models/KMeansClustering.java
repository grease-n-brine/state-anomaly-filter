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

    public KMeansClustering(int k, int maxIterations) {
        this.k = k;
        this.maxIterations = maxIterations;
        this.clusters = new ArrayList<>();
        this.records = new ArrayList<>();
        Random random = new Random();
    }

    public double euclideanDistance(Record r1, Record r2) {
        return 0.0;
    }
}
