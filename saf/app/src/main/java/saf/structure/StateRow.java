package saf.structure;

public class StateRow {
    private final int sequenceNumber;
    private final TimeCell timestamp;
    private final double[] data;

    public StateRow(int sequenceNumber, TimeCell timestamp, double[] data) {
        this.sequenceNumber = sequenceNumber;
        this.timestamp = timestamp;
        this.data = data;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public TimeCell getTimestamp() {
        return timestamp;
    }

    public double[] getData() {
        return data;
    }

}
