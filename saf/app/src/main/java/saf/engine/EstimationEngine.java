package saf.engine;

import saf.structure.StateRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstimationEngine {
    private final Map<Integer, StateRow> stateRowsMap;
    private final double alpha;

    public EstimationEngine() {
        this.stateRowsMap = new HashMap<>();
        this.alpha = 0.75; 
    }

    public void processStream(ArrayList<StateRow> stateRows) {
        for (StateRow stateRow : stateRows) {
            
        }
    }
}
