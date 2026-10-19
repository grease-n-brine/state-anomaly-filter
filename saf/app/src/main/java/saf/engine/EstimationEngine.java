package saf.engine;

import saf.structure.StateRow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstimationEngine {
    private final Map<Integer, StateRow> stateRowsMap;

    public EstimationEngine() {
        this.stateRowsMap = new HashMap<>();
    }
}
