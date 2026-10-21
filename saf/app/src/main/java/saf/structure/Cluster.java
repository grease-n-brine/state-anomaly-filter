package saf.structure;

public class Cluster {
    int id;
    private Record centroid;

    public Cluster(Record centroid) {
        this.centroid = centroid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Record getCentroid() {
        return centroid;
    }
    
}
