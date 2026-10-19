package saf.structure;

import java.util.ArrayList;

public class StateRow {
    private final int sequenceNumber;
    private final ArrayList<Double> data;

    public StateRow(int sequenceNumber, ArrayList<Double> data) {
        this.sequenceNumber = sequenceNumber;
        this.data = data;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public ArrayList<Double> getData() {
        return data;
    }

}
