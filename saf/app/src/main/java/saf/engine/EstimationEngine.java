package saf.engine;

import saf.structure.StateRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstimationEngine {
    private final Map<Integer, StateRow> lastEstimates;
    private final double alpha;
    private final int warmUpPeriod;

    public EstimationEngine(double alpha, int warmUpPeriod) {
        this.lastEstimates = new HashMap<>();
        this.alpha = alpha; 
        this.warmUpPeriod = warmUpPeriod;
    }

    public void mapVariables(ArrayList<StateRow> stateRows) {

    }

    public void processStream(ArrayList<StateRow> stateRows) {
        for (StateRow stateRow : stateRows) {
            int sequenceNumber = stateRow.getSequenceNumber();
            ArrayList<Double> values = stateRow.getData();
            int variableCount = values.size();
        }
    }

    public void warmUpBaseline(ArrayList<StateRow> stateRows) {
    }
}
