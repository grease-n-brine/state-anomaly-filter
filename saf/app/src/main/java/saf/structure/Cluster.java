package saf.structure;

@SuppressWarnings("FieldMayBeFinal")
public class Cluster {
    int id;
    private Point centroid;

    public Cluster(Point centroid) {
        this.centroid = centroid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getCentroid() {
        return centroid;
    }

    public void setCentroid(Point centroid) {
        this.centroid = centroid;
    }

    public double getCentroidX() {
        return centroid.getX();
    }
    public double getCentroidY() {
        return centroid.getY();
    }
}
